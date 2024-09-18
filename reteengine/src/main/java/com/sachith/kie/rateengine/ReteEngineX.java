package com.sachith.kie.rateengine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class ReteEngineX {

    private final List<RuleX> rules = new ArrayList<>();
    private final List<Fact> facts = new ArrayList<>();

    public void addRule(RuleX rule) {
        rules.add(rule);
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public void evaluate() {
        Map<String, Object> factMap = new HashMap<>();
        for (Fact fact : facts) {
            factMap.put(fact.getName(), fact.getValue());
        }

        for (RuleX rule : rules) {
            if (rule.evaluateCondition(factMap)) {
                rule.executeAction(factMap);
            }
        }
    }
}
