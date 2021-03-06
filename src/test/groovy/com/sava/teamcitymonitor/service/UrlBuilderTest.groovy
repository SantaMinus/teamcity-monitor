package com.sava.teamcitymonitor.service

import spock.lang.Specification

class UrlBuilderTest extends Specification {
    def builder = new UrlBuilder()

    def "buildsLocator() "() {
        expect:
        builder.buildsLocator().toString() == 'https:/teamcity.example.com/app/rest/builds?locator=user:T.Est'
    }
}
