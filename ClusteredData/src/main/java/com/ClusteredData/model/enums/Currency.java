package com.ClusteredData.model.enums;

import java.util.stream.Stream;

public enum Currency {
    JOR("JOR"),
    USD("USD"),
    GBP("GBP"),
    JPY("JPY"),
    AUD("AUD"),
    EUR("EUR"),
    AFN("AFN"),
    BHD("BHD"),
    BRL("BRL"),
    CAD("CAD");

    private final String code;


    Currency(String code) {
        this.code = code;

    }

    public String getCode() {
        return code;
    }



    public static Stream<Currency> stream() {
        return Stream.of(Currency.values());
    }

}