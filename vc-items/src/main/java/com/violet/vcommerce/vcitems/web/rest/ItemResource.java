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

    private final IItemService itemService;

    private static final String PREFIX_NAME = "/item";

    // Construct
    public ItemResource(IItemService itemService) {
        this.itemService = itemService;
    }

    // Services
    @GetMapping(PREFIX_NAME)
    public List<ItemDTO> getAll() {
        return itemService.findAll();
    }

    @GetMapping(PREFIX_NAME + "/{publicId}")
    public ItemDTO getItem(@PathVariable String publicId) {
        return itemService.findByPublicID(publicId);
    }


}
