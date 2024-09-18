package com.sachith;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// A simple fact class
public class Fact {

    private String name;
    private Object value;

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
