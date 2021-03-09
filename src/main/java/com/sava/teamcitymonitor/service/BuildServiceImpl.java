package com.sava.teamcitymonitor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLConnection;

@Service
public class BuildServiceImpl implements BuildService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuildServiceImpl.class);
    @Autowired
    UrlBuilder builder;
    @Value("${teamcity.host}")
    private String host;
    @Value("${teamcity.login}")
    private String login;

    @Override
    public String getRunningBuilds(String user) {
        try {
            URLConnection connection = builder.buildsLocator(host, login).openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null)
                response.append(inputLine);

            in.close();
            return response.toString();
        } catch (MalformedURLException | URISyntaxException e) {
            LOGGER.error("Failed to build a URL", e);
        } catch (IOException e) {
            LOGGER.error("Failed to contact the URL", e);
        }
        return "Hello world!";
    }
}
