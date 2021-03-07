package com.sava.teamcitymonitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TeamCityMonitorApplication extends SpringBootServletInitializer {
    @Value("${teamcity.host}")
    String host;

    public static void main(String[] args) {
        SpringApplication.run(TeamCityMonitorApplication.class, args);
    }
}
