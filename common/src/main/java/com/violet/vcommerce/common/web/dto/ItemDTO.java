package com.violet.vcommerce.common.web.dto;

import com.violet.vcommerce.common.web.dto.abs.DefaultVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * A DTO representing a item.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO extends DefaultVO {

    @NotNull
    private ProductDTO product;

    private int quantity;

    public BigDecimal getTotalItem() {
        return this.product.getAmount().getAmount().multiply(new BigDecimal(this.quantity));
    }

}
