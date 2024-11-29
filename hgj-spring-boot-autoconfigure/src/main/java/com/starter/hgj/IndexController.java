package com.starter.hgj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(HelloProperties.class)
public class IndexController {

    private HelloProperties helloProperties;

    @RequestMapping("/hello")
    public String index(){
        return helloProperties.getName()+"欢迎您";
    }

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
