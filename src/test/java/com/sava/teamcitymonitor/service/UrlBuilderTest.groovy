package com.sava.teamcitymonitor.service

import spock.lang.Specification

class UrlBuilderTest extends Specification {
    def "buildsLocator() "() {
        expect:
        UrlBuilder.buildsLocator().toString() == 'https:/teamcity.example.com/app/rest/builds?locator=user:{login}'
    }
}
