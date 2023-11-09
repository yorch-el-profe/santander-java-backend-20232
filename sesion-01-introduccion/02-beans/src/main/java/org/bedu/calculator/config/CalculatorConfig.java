package org.bedu.calculator.config;

import java.util.Scanner;

import org.bedu.calculator.util.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    
    @Bean
    public Calculator createCalculator() {
        return new Calculator();
    }

    @Bean
    public Scanner createScanner() {
        return new Scanner(System.in);
    }
}
