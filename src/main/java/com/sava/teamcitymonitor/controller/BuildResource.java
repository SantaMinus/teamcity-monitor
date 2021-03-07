package com.sava.teamcitymonitor.controller;

import com.sava.teamcitymonitor.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teamcity")
public class BuildResource {
    @Autowired
    private final BuildService service;

    public BuildResource(BuildService buildService) {
        this.service = buildService;
    }

    @GetMapping(value = "/builds")
    public String getRunningBuilds(@RequestParam(value = "user", defaultValue = "test") String user) {
        return service.getRunningBuilds(user);
    }
}
