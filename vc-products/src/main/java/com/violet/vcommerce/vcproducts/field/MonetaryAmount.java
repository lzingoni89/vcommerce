package com.violet.vcommerce.vcproducts.field;

import com.violet.vcommerce.vcproducts.enums.Currency;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@Embeddable
public class MonetaryAmount {

    @NotNull
    private Currency currency;

    @NotNull
    @Column(nullable = false, precision = 13, scale = 2)
    @Digits(integer = 15, fraction = 2)
    private BigDecimal amount;

}
