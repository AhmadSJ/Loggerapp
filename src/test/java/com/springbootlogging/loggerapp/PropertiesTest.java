package com.springbootlogging.loggerapp;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@TestPropertySource(locations = "/application-startup-test.properties")
public class PropertiesTest {

    @Value("${foo}")
    String welcome;

    @Test
    public void test() {
        System.out.println(welcome);
        assertThat(welcome).isEqualTo("bar");
    }
}