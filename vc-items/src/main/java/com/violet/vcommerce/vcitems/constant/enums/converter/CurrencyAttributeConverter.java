package com.violet.vcommerce.vcitems.constant.enums.converter;

import com.violet.vcommerce.vcitems.constant.enums.Currency;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Attribute converter class for Currency
 */
@Converter(autoApply = true)
public class CurrencyAttributeConverter implements AttributeConverter<Currency, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Currency currency) {
        if (currency == null) {
            return null;
        }
        return currency.getId();
    }

    @Override
    public Currency convertToEntityAttribute(Integer id) {
        if (id == null) {
            return null;
        }

        return Currency.getByID(id);
    }
}
