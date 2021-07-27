package com.springbootlogging.loggerapp;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@TestPropertySource(locations = "/application-startup-test.properties")
public class StartUpTest {

    @Value("${foo}")
    String welcome;

    String[] args = new String[0];

    @Test
    public void test() {
        SpringApplication.run(LoggerAppApplication.class, args);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(welcome);
        assertThat(welcome).isEqualTo("bar");
    }

}