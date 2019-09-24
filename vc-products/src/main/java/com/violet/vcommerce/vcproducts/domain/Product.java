package com.violet.vcommerce.vcproducts.domain;

import com.violet.vcommerce.vcproducts.domain.abs.DefaultBO;
import com.violet.vcommerce.vcproducts.field.MonetaryAmount;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@Table(name = "pro_producto")
public class Product extends DefaultBO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 100)
    @Column(name = "name", length = 100, nullable = false)
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
