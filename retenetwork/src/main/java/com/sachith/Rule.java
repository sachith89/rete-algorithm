package com.sachith;

import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// A rule class
public class Rule {
    public List<Condition> conditions;
    public Runnable action;

    public Rule(List<Condition> conditions, Runnable action) {
        this.conditions = conditions;
        this.action = action;
    }

    public boolean evaluate(List<Fact> facts) {
        for (Condition condition : conditions) {
            boolean conditionMatched = false;
            for (Fact fact : facts) {
                if (condition.evaluate(fact)) {
                    conditionMatched = true;
                    break;
                }
            }
            if (!conditionMatched) return false;  // If one condition fails, the rule doesn't match
        }
        return true;
    }

    public void execute() {
        action.run();
    }
}
