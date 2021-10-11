package com.krukovska.microservices.business.two.metrics.micrometer;

import io.micrometer.core.instrument.binder.JvmThreadMetrics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicrometerAppTwo {

    @Bean
    JvmThreadMetrics threadMetrics() {
        return new JvmThreadMetrics();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MicrometerAppTwo.class, args);
    }

}
