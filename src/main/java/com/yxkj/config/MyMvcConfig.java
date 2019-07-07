package com.yxkj.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2019/7/2.
 */

//@EnableWebMvc
@Configuration
public class MyMvcConfig  extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("xingkong");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/technology").setViewName("technology");
        registry.addViewController("/product").setViewName("product");
        registry.addViewController("/contact").setViewName("contact");

    }
}
