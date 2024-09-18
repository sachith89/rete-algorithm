package com.sachith.kie.rateengine;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class Fact {

    private final String name;
    private final Object value;

    public Fact(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
