package com.sachith.kie.rateengine;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
@Configuration
public class ReteConfig {

    @Bean
    public ReteEngineX reteEngine() {
        return new ReteEngineX();
    }
}
