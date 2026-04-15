package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Adding {} and {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        logger.info("Dividing {} by {}", a, b);
        if (b == 0) {
            logger.error("Cannot divide by zero!");
            throw new IllegalArgumentException("b must not be 0");
        }
        return a / b;
    }
}
