package com.sava.teamcitymonitor.service;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@Component
public class UrlBuilder {
    private static final String APP_PATH = "app";
    private static final String REST_PATH = "rest";
    private static final String USER_PARAM = "locator=user:%s";
    private static final String BUILDS_PATH = "builds";

    URL buildsLocator(String host, String login) throws MalformedURLException, URISyntaxException {
        return new URIBuilder()
                .setScheme("https")
                .setHost(host)
                .setPathSegments(APP_PATH, REST_PATH, BUILDS_PATH)
                .setCustomQuery(String.format(USER_PARAM, login))
                .build()
                .toURL();
    }
}
