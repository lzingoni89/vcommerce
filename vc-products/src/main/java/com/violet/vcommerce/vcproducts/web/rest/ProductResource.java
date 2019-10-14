package com.violet.vcommerce.vcproducts.web.rest;

import com.violet.vcommerce.vcproducts.service.IProductService;
import com.violet.vcommerce.vcproducts.service.dto.ProductDTO;
import com.violet.vcommerce.vcproducts.web.rest.abs.ApiRestResource;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CommonsLog
@RestController
@RequestMapping("/api")
public class ProductResource extends ApiRestResource {

    private final IProductService productService;

    private static final String PREFIX_NAME = "/product";

    // Construct
    public ProductResource(IProductService productService) {
        this.productService = productService;
    }

    // Services
    @GetMapping(PREFIX_NAME)
    public List<ProductDTO> getAll() {
        return productService.findAll();
    }

    @GetMapping(PREFIX_NAME + "/{publicId}")
    public ProductDTO getProduct(@PathVariable String publicId) {
        return productService.findByPublicId(publicId);
    }

}
