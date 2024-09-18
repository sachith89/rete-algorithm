package com.sachith.kie.rateengine;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
public class RateEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateEngineApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ReteConfig.class);
        ReteEngineX reteEngine = context.getBean(ReteEngineX.class);

        // Define rules (using MVEL)
        RuleX rule1 = new RuleX("'43200' < onwardsTotalSegmentDurationInSeconds", "System.out.println('In policy - first condition');");
        RuleX rule2 = new RuleX("!java.util.Collections.disjoint(['F', 'J', 'C', 'S', 'Y'], cabinTypeList )", "System.out.println('In policy - second condition');");
        RuleX rule3 = new RuleX("'[R]' contains refundType", "System.out.println('In policy - third condition');");

        // Add rules to the engine
        reteEngine.addRule(rule1);
        reteEngine.addRule(rule2);
        reteEngine.addRule(rule3);

        // Define facts
        reteEngine.addFact(new Fact("onwardsTotalSegmentDurationInSeconds", 43201));
        reteEngine.addFact(new Fact("cabinTypeList", List.of("Y")));
        reteEngine.addFact(new Fact("refundType", "R"));

        // Evaluate the rules against the facts
        reteEngine.evaluate();
    }
}
