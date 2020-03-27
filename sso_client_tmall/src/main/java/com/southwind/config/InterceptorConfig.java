package com.southwind.config;

import com.southwind.interceptor.TmallInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = {"/tmall"};
        registry.addInterceptor(new TmallInterceptor()).addPathPatterns(patterns);
    }
}
