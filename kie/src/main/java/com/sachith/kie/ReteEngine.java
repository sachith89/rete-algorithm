package com.sachith.kie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */

// Rete Engine that handles the rules and working memory
public class ReteEngine {
    WorkingMemory workingMemory;
    List<Rule> rules;

    public ReteEngine(WorkingMemory workingMemory) {
        this.workingMemory = workingMemory;
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void run() {
        // Run each rule to see if conditions are satisfied and fire the rule
        for (Rule rule : rules) {
            rule.fire();
        }
    }
}

