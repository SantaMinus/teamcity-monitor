package com.sava.teamcitymonitor.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@AutoConfigureMockMvc
@SpringBootTest
@WebAppConfiguration
class OAuthIT extends Specification {
    @Autowired
    private MockMvc mockMvc

    def "OAuth redirects to GitHub login"() {
        when:
        def res = mockMvc.perform(get("/teamcity/builds")).andReturn().response

        then:
        res.getHeader('Location') == 'http://localhost/oauth2/authorization/github'
        res.getRedirectedUrl() == 'http://localhost/oauth2/authorization/github'
        res.status == 302
    }
}
