package com.sachith;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// BetaNode for combining conditions (join)
public class BetaNode {
    private List<AlphaNode> alphaNodes;
    private Rule rule;

    public BetaNode(List<AlphaNode> alphaNodes, Rule rule) {
        this.alphaNodes = alphaNodes;
        this.rule = rule;
    }

    public void process() {
        List<Fact> combinedFacts = new ArrayList<>();
        for (AlphaNode alphaNode : alphaNodes) {
            combinedFacts.addAll(alphaNode.getMatchingFacts());
        }
        if (rule.evaluate(combinedFacts)) {
            rule.execute();  // Fire the rule if all conditions are matched
        }
    }
}
