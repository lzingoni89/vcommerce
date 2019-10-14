package com.violet.vcommerce.vcitems.service;

import com.violet.vcommerce.common.web.dto.ItemDTO;

import java.util.List;

public interface IItemService {

    List<ItemDTO> findAll();

    ItemDTO findByPublicID(String publicId);

}
