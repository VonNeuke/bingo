package com.liuke.config;

import com.liuke.interceptor.ParamCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class SpringMvcConfig implements WebMvcConfigurer {

    private ParamCheckInterceptor paramCheckInterceptor;

    @Autowired
    public void getParamCheckInterceptor(ParamCheckInterceptor paramCheckInterceptor) {
        this.paramCheckInterceptor = paramCheckInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(paramCheckInterceptor).addPathPatterns("/**");
    }
}
