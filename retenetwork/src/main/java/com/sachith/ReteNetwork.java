package com.sachith;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
import java.util.ArrayList;
import java.util.List;

public class ReteNetwork {
    private List<AlphaNode> alphaNodes = new ArrayList<>();
    private List<BetaNode> betaNodes = new ArrayList<>();
    private List<Fact> workingMemory = new ArrayList<>();

    // Add a new rule to the RETE network
    public void addRule(Rule rule) {
        List<AlphaNode> ruleAlphaNodes = new ArrayList<>();
        for (Condition condition : rule.conditions) {
            AlphaNode alphaNode = new AlphaNode(condition);
            alphaNodes.add(alphaNode);
            ruleAlphaNodes.add(alphaNode);
        }
        betaNodes.add(new BetaNode(ruleAlphaNodes, rule));
    }

    // Add a fact to the working memory and process it
    public void addFact(Fact fact) {
        workingMemory.add(fact);

        // Process fact through all alpha nodes
        for (AlphaNode alphaNode : alphaNodes) {
            alphaNode.processFact(fact);
        }

        // Process the fact through the beta nodes (join conditions)
        for (BetaNode betaNode : betaNodes) {
            betaNode.process();
        }
    }
}
