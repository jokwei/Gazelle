package com.jokwei.gazelle.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "gazelle.other")
public class OtherConfigBean {

    private String sex;
    private Integer age;
    private Boolean worked;

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getWorked() {
        return worked;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWorked(Boolean worked) {
        this.worked = worked;
    }

    @Override
    public String toString() {
        return "OtherConfigBean{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", worked=" + worked +
                '}';
    }
}
