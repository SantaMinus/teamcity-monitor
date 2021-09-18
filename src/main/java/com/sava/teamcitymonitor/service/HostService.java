package com.sava.teamcitymonitor.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
// TODO: introduce a better method to store host
public class HostService {
    private String host;
}
