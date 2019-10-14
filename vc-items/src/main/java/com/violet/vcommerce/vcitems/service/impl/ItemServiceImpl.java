package com.violet.vcommerce.vcitems.service.impl;

import com.violet.vcommerce.common.web.dto.ItemDTO;
import com.violet.vcommerce.common.web.dto.ProductDTO;
import com.violet.vcommerce.vcitems.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private RestTemplate productAPI;

    @Override
    public List<ItemDTO> findAll() {
        var result = productAPI.getForObject("/", ProductDTO[].class);
        return Arrays.asList(result)
                .stream()
                .map(prod -> new ItemDTO(prod, 2))
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO findByPublicID(String publicId) {
        var map = new HashMap<String, String>();
        map.put("id", publicId);
        var product = productAPI.getForObject("/{id}", ProductDTO.class, map);
        return new ItemDTO(product, 1);
    }
}
