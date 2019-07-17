package com.ludata.luDataTest.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("").setViewName("index3.html");  //设置默认请求配置
        registry.addViewController("/22").setViewName("index2.html");  //设置默认请求配置
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //配置静态资源访问
        registry.addResourceHandler("/**").
                addResourceLocations("classpath:/static/").
                addResourceLocations("classpath:/resources/").
                addResourceLocations("classpath:/public/");
        super.addResourceHandlers(registry);
        ;
    }
}
