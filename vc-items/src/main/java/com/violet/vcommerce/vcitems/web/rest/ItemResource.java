package com.violet.vcommerce.vcitems.web.rest;

import com.violet.vcommerce.common.web.dto.ItemDTO;
import com.violet.vcommerce.common.web.rest.ApiRestResource;
import com.violet.vcommerce.vcitems.service.IItemService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CommonsLog
@RestController
@RequestMapping("/api")
public class ItemResource extends ApiRestResource {

    private final IItemService itemServiceFeignImpl;

    private static final String PREFIX_NAME = "/item/";

    // Construct
    public ItemResource(IItemService itemServiceFeignImpl) {
        this.itemServiceFeignImpl = itemServiceFeignImpl;
    }

    // Services
    @GetMapping(PREFIX_NAME)
    public List<ItemDTO> getAll() {
        return itemServiceFeignImpl.findAll();
    }

    //    @HystrixCommand(fallbackMethod = "handleError")
    @GetMapping(PREFIX_NAME + "{publicId}")
    public ItemDTO getItem(@PathVariable String publicId) {
        return itemServiceFeignImpl.findByPublicID(publicId);
    }


}
