package com.jokwei.gazelle.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:custom.properties")
@ConfigurationProperties(prefix = "gazelle.custom")
public class CustomConfigBean {
    String where;

    String whoami;

    public String getWhere() {
        return where;
    }

    public String getWhoami() {
        return whoami;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setWhoami(String whoami) {
        this.whoami = whoami;
    }

    @Override
    public String toString() {
        return "CustomConfigBean{" +
                "where='" + where + '\'' +
                ", whoami='" + whoami + '\'' +
                '}';
    }
}
