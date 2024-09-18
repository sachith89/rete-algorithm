package com.sachith.kie;

import java.util.Arrays;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class ReteAlgorithmDemo {

    public static void main(String[] args) {
        // Initialize Working Memory
        //('43200' < onwardsTotalSegmentDurationInSeconds) ? (!java.util.Collections.disjoint(['F', 'J', 'C', 'S', 'Y'],
        // input.cabinTypeList)) && ('[R]' contains input.refundType) : SKIP "
        WorkingMemory wm = new WorkingMemory();
        wm.addWME(new WorkingMemoryElement("color", "red"));
        wm.addWME(new WorkingMemoryElement("size", "large"));

        // Create Alpha Nodes for conditions
        AlphaNode alphaColor = new AlphaNode("onwardsTotalSegmentDurationInSeconds", "43200");
        AlphaNode alphaSize = new AlphaNode("size", "large");

        // Add WMEs to alpha nodes
        for (WorkingMemoryElement wme : wm.getWMEs()) {
            alphaColor.addWME(wme);
            alphaSize.addWME(wme);
        }

        // Create a Beta Node to join conditions
        BetaNode betaNode = new BetaNode(alphaColor, alphaSize);

        // Define a rule using these conditions
        Rule rule1 = new Rule("Rule1", Arrays.asList(alphaColor, alphaSize), betaNode);

        // Add rule to Rete engine
        ReteEngine rete = new ReteEngine(wm);
        rete.addRule(rule1);

        // Run the Rete engine
        rete.run();
    }
}
