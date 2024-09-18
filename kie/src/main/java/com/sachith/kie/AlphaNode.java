package com.sachith.kie;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */

// Alpha Node represents a pattern that matches single conditions
public class AlphaNode {
    String attribute;
    String value;
    List<WorkingMemoryElement> matchedWMEs;

    public AlphaNode(String attribute, String value) {
        this.attribute = attribute;
        this.value = value;
        this.matchedWMEs = new ArrayList<>();
    }

    public void addWME(WorkingMemoryElement wme) {
        if (wme.getAttribute().equals(attribute) && wme.getValue().equals(value)) {
            matchedWMEs.add(wme);
        }
    }

    public List<WorkingMemoryElement> getMatchedWMEs() {
        return matchedWMEs;
    }
}