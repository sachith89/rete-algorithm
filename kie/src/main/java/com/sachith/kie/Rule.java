package com.sachith.kie;

import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// Rule stores conditions (patterns) and actions
public
class Rule {
    String name;
    List<AlphaNode> alphaNodes;
    BetaNode betaNode;

    public Rule(String name, List<AlphaNode> alphaNodes, BetaNode betaNode) {
        this.name = name;
        this.alphaNodes = alphaNodes;
        this.betaNode = betaNode;
    }

    public void fire() {
        if (betaNode.isMatch()) {
            System.out.println("Rule '" + name + "' is fired.");
        }
    }
}