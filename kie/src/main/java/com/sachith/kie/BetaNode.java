package com.sachith.kie;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// Beta Node joins multiple Alpha Nodes
public class BetaNode {
    AlphaNode alpha1;
    AlphaNode alpha2;

    public BetaNode(AlphaNode alpha1, AlphaNode alpha2) {
        this.alpha1 = alpha1;
        this.alpha2 = alpha2;
    }

    // Checks if there is a match between two alpha nodes
    public boolean isMatch() {
        return !alpha1.getMatchedWMEs().isEmpty() && !alpha2.getMatchedWMEs().isEmpty();
    }

    public void executeRule() {
        if (isMatch()) {
            System.out.println("Rule Fired: " + alpha1.attribute + " AND " + alpha2.attribute + " matched!");
        }
    }
}