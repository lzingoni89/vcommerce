package com.violet.vcommerce.vcproducts.service.dto.mapper;

import com.violet.vcommerce.vcproducts.domain.Product;
import com.violet.vcommerce.vcproducts.service.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Mapper for the entity {@link Product} and its DTO called {@link ProductDTO}.
 */
@Service
public class ProductMapper {

    //    DTO to ENTITY
    public Product dtoToEntity(ProductDTO dto) {
        if (dto == null) {
            return null;

        }

        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setAmount(dto.getAmount());
        return entity;

    }

    public List<Product> dtoListToEntityList(List<ProductDTO> dtoList) {
        if (dtoList == null) {
            return null;
        }

        return dtoList.stream()
                .filter(Objects::nonNull)
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }

    //    ENTITY to DTO
    public ProductDTO entityToDTO(Product entity) {
        if (entity == null) {
            return null;
        }

        ProductDTO dto = new ProductDTO();
        dto.setName(entity.getName());
        dto.setAmount(entity.getAmount());
        return dto;

    }

    public List<ProductDTO> entityListToDTOList(List<Product> entityList) {
        if (entityList == null) {
            return null;
        }

        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

}
