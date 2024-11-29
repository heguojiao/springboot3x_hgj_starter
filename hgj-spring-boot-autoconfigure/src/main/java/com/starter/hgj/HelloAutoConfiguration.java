package com.starter.hgj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 给web应用自动添加一个首页
 */
@Configuration
@ConditionalOnProperty(prefix = "hgj.hello",name = "enabled",havingValue = "true")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    @Bean
    public IndexController indexController(HelloProperties helloProperties){
        return new IndexController(helloProperties);
    }

}
