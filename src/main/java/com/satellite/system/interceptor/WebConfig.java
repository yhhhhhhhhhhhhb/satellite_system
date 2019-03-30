package com.satellite.system.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:yuanhu
 * @Description:注册拦截器
 * @Date: Created in 10:38 2019/3/30
 * @Modified By:
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{


    @Bean
    public JwtInterceptor jwtInterceptor(){
        return new JwtInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(jwtInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/login");
    }

}
