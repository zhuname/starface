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
        //测试页面
        registry.addViewController("/ceshi").setViewName("ceshi");
        //首页
        registry.addViewController("/").setViewName("index");

        //关于垣象
        registry.addViewController("/about").setViewName("about");
        //核心技术
        registry.addViewController("/technology").setViewName("technology");

//        registry.addViewController("/product").setViewName("product");
        //联系我们的页面
        registry.addViewController("/contact").setViewName("contact");

        //安防领域页面
        registry.addViewController("/security").setViewName("security");
        //金融领域页面
        registry.addViewController("/banking").setViewName("banking");
        //交通领域页面
        registry.addViewController("/city").setViewName("city");
        //零售领域页面
        registry.addViewController("/selling").setViewName("selling");

    }
}
