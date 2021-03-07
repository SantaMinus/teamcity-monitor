package com.sava.teamcitymonitor.service;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@Component
public class UrlBuilder {
    String url = "https://teamcity.{host}.com/app/rest/builds?locator=user:{login}";

    private static final String APP_PATH = "app";
    private static final String REST_PATH = "rest";
    private static final String LOCATOR_PARAM_NAME = "locator";
    private static final String USER_PARAM = "user:%s";
    private static final String BASE_URL = "teamcity.%s.com";
    private static final String BUILDS_PATH = "builds";

    URL buildsLocator(String host, String login) throws MalformedURLException, URISyntaxException {
        return new URIBuilder()
                .setScheme("https")
                .setHost(String.format(BASE_URL, host))
                .setPathSegments(APP_PATH, REST_PATH, BUILDS_PATH)
                // TODO: fix parameter
//                .addParameter(LOCATOR_PARAM_NAME, String.format(USER_PARAM, login))
                .build()
                .toURL();
    }
}
