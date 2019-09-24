package com.violet.vcommerce.vcproducts.service.impl;

import com.violet.vcommerce.vcproducts.repository.ProductRepository;
import com.violet.vcommerce.vcproducts.service.IProductService;
import com.violet.vcommerce.vcproducts.service.dto.ProductDTO;
import com.violet.vcommerce.vcproducts.service.dto.mapper.ProductMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CommonsLog
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        return productMapper.entityListToDTOList(productRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTO findByPublicId(String publicId) {
        return productMapper.entityToDTO(productRepository.getFirstByPublicId(publicId).orElse(null));
    }

}
