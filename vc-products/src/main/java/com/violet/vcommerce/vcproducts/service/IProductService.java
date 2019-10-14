package com.violet.vcommerce.vcproducts.service;

import com.violet.vcommerce.common.web.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    List<ProductDTO> findAll();

    ProductDTO findByPublicId(String publicId);

}
