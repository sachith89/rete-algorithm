package com.sachith.kie;


/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// Working Memory Element (WME) represents facts
public class WorkingMemoryElement {
    String attribute;
    String value;

    public WorkingMemoryElement(String attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "WME{" +
                "attribute='" + attribute + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}




