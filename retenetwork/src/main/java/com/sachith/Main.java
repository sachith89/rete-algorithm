package com.sachith;

import java.util.Arrays;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        // Create a simple ReteNetwork
        ReteNetwork reteNetwork = new ReteNetwork();

        // Define a rule
        Rule rule = new Rule(
                Arrays.asList(
                        new Condition("name", "==", "John"),
                        new Condition("age", "==", 30)
                ),
                () -> System.out.println("Rule triggered: John is 30!")
        );

        // Add the rule to the RETE network
        reteNetwork.addRule(rule);

        // Add facts (Working Memory)
        Fact fact1 = new Fact("name", "John");
        Fact fact2 = new Fact("age", 31);

        // Add the facts to the RETE network
        reteNetwork.addFact(fact1);
        reteNetwork.addFact(fact2);
    }
}