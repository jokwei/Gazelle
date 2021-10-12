package com.jokwei.gazelle;

import com.jokwei.gazelle.bean.ConfigBean;
import com.jokwei.gazelle.bean.CustomConfigBean;
import com.jokwei.gazelle.bean.OtherConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties({OtherConfigBean.class, CustomConfigBean.class})
@RestController
@SpringBootApplication
public class GazelleApplication {

    @Autowired
    OtherConfigBean otherConfigBean;

    @Autowired
    ConfigBean configBean;

    @Autowired
    CustomConfigBean customConfigBean;

    @RequestMapping("/")
    String index() {
        return configBean.getName() + ", " + configBean.getTitle() + ", " + configBean.getEnv();
    }

    @RequestMapping("/other")
    String other() {
        return otherConfigBean.toString();
    }

    @RequestMapping("/custom")
    String custom() {
        return customConfigBean.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(GazelleApplication.class, args);
    }

}
