package com.sava.teamcitymonitor.service;

import org.springframework.stereotype.Component;

@Component("buildService")
public class BuildServiceImpl implements BuildService {
    @Override
    public String getRunningBuilds(String user) {
        return "Hello world!";
    }
}
