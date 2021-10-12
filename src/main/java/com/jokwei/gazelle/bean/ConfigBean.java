package com.jokwei.gazelle.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class ConfigBean {
    @Value("${gazelle.config.name}")
    private String name;
    @Value("${gazelle.config.title}")
    private String title;
    @Value("${gazelle.config.env}")
    private String env;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getEnv() {
        return env;
    }
}
