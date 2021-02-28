package com.sava.teamcitymonitor.service;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlBuilder {
    String url = "https:/teamcity.{host}.com/app/rest/builds?locator=user:{login}";

    @Value("${teamcity.host}")
    private static String host;
    private static final String BASIC_PATH = "/app/rest";
    private static final String LOCATOR_PARAM_NAME = "locator";
    private static final String USER_PARAM = "user:{login}";
    private static final String BASIC_URL = "https://teamcity.{host}.com/app/rest";
    private static final String BUILDS_PATH = "/builds";
    private static final String USER_LOCATOR_PARAM = "locator=user:";


    static URL buildsLocator() throws MalformedURLException, URISyntaxException {
        return new URIBuilder()
                .setScheme("https")
                .setHost(host)
                .setPathSegments(BASIC_PATH, BUILDS_PATH).addParameter(LOCATOR_PARAM_NAME, String.format(USER_PARAM, "login"))
                .build()
                .toURL();
    }
}
