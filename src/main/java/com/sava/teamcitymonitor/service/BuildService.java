package com.sava.teamcitymonitor.service;

public interface BuildService {
    /**
     * Returns running builds started by a specified user
     *
     * @param user TeamCity username to get builds by
     * @return some JSON, needs rework
     */
    String getByUser(String user);
}
