package com.sava.teamcitymonitor.controller;

import com.sava.teamcitymonitor.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/host")
public class HostResource {
    @Autowired
    HostService hostService;

    @GetMapping
    public String getHost() {
        return hostService.getHost();
    }

    @PostMapping(consumes = "application/json")
    public void setHost(@RequestBody String host) {
        hostService.setHost(host);
    }
}
