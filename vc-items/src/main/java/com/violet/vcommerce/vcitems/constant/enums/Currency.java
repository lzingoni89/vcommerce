package com.violet.vcommerce.vcitems.constant.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * List of Currencies used in the system.
 */
public enum Currency {

    ARS(0, "ars"),
    USD(1, "usd");

    @Getter
    @JsonIgnore
    private Integer id;

    @Getter
    private String code;

    Currency(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public static Currency getByCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException();
        }
        return Stream.of(Currency.values())
                .filter(p -> p.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public static Currency getByID(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }
        return Stream.of(Currency.values())
                .filter(p -> p.getId().intValue() == id.intValue())
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
