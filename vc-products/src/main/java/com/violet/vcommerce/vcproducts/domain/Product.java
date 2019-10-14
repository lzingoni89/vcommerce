package com.violet.vcommerce.vcproducts.domain;

import com.violet.vcommerce.common.domain.DefaultBO;
import com.violet.vcommerce.common.field.MonetaryAmount;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Product entity class
 */
@Data
@Entity
@Table(name = "pro_product")
public class Product extends DefaultBO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 100)
    @Column(name = "product_name", length = 100, nullable = false)
    @NotBlank
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "currency", column = @Column(name = "amount_cur", nullable = false)),
            @AttributeOverride(name = "amount", column = @Column(name = "amount_amt", nullable = false))
    })
    @NotNull
    private MonetaryAmount amount;

}
