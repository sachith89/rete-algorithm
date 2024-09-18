package com.sachith.kie.rateengine;


import org.mvel2.MVEL;

import java.util.Map;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class RuleX {

    private final String condition;
    private final String action;

    public RuleX(String condition, String action) {
        this.condition = condition;
        this.action = action;
    }

    public boolean evaluateCondition(Map<String, Object> facts) {
        return (boolean) MVEL.eval(condition, facts);
    }

    public void executeAction(Map<String, Object> facts) {
        MVEL.eval(action, facts);
    }

    public String getCondition() {
        return condition;
    }

    public String getAction() {
        return action;
    }
}
