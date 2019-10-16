package com.violet.vcommerce.vcitems.service.impl;

import com.violet.vcommerce.common.web.dto.ItemDTO;
import com.violet.vcommerce.vcitems.client.ProductClientAPI;
import com.violet.vcommerce.vcitems.service.IItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("itemServiceFeignImpl")
public class ItemServiceFeignImpl implements IItemService {

    private ProductClientAPI productClientAPI;

    public ItemServiceFeignImpl(ProductClientAPI productClientAPI) {
        this.productClientAPI = productClientAPI;
    }

    @Override
    public List<ItemDTO> findAll() {
        return productClientAPI.getAll().stream()
                .map(prod -> new ItemDTO(prod, 2))
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO findByPublicID(String publicId) {
        var product = productClientAPI.getProduct(publicId);
        return new ItemDTO(product, 3);
    }
}
