package com.gsonkeno.springbootbean.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Value("${company.ceo}")
    private String ceo;

    @Value("${company.coo}")
    private String coo;

    @Value("${company.cto}")
    private String cto;

    private String cfo;

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCoo() {
        return coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ceo='" + ceo + '\'' +
                ", coo='" + coo + '\'' +
                ", cto='" + cto + '\'' +
                '}';
    }
}
