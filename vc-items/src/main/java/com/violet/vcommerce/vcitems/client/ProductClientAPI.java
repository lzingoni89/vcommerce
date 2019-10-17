package com.violet.vcommerce.vcitems.client;

import com.violet.vcommerce.common.web.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "vc-products")
public interface ProductClientAPI {

    String PREFIX_NAME = "/api/product/";

    @GetMapping(PREFIX_NAME)
    List<ProductDTO> getAll();

    @GetMapping(PREFIX_NAME + "{publicId}")
    ProductDTO getProduct(@PathVariable String publicId);

}
