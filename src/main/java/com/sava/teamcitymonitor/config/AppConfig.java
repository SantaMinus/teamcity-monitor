package com.sava.teamcitymonitor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.sava.teamcitymonitor")
public class AppConfig {
    @Value("${teamcity-host}")
    public static String host;
    @Value("${spring.application.name}")
    public static String name;
}
