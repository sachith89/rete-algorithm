package com.sachith;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */

import java.util.ArrayList;
import java.util.List;

// Alpha node for single condition matching
public class AlphaNode {
    private Condition condition;
    private List<Fact> matchingFacts = new ArrayList<>();

    public AlphaNode(Condition condition) {
        this.condition = condition;
    }

    public void processFact(Fact fact) {
        if (condition.evaluate(fact)) {
            matchingFacts.add(fact);  // Add matching fact to this node
        }
    }

    public List<Fact> getMatchingFacts() {
        return matchingFacts;
    }
}
