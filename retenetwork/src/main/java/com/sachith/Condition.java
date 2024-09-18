package com.sachith;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// A simple condition class
public class Condition {
    private String factName;
    private String operator;
    private Object value;

    public Condition(String factName, String operator, Object value) {
        this.factName = factName;
        this.operator = operator;
        this.value = value;
    }

    public boolean evaluate(Fact fact) {
        if (!fact.getName().equals(factName)) return false;

        // Check different operators, such as equality
        if (operator.equals("==")) {
            return fact.getValue().equals(value);
        }
        // Additional operators can be added (e.g. >, <, etc.)
        return false;
    }
}