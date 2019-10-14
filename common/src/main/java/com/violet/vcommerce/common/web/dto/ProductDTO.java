package com.violet.vcommerce.common.web.dto;

import com.violet.vcommerce.common.field.MonetaryAmount;
import com.violet.vcommerce.common.web.dto.abs.DefaultVO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A DTO representing a product.
 */
@Data
public class ProductDTO extends DefaultVO {

    @Size(max = 100)
    @NotBlank
    private String name;

    @NotNull
    private MonetaryAmount amount;

}
