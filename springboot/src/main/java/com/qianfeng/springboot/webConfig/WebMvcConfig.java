package com.qianfeng.springboot.webConfig;

import com.qianfeng.springboot.Intercepter.MyIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private MyIntercepter intercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(intercepter).addPathPatterns("/*");
    }
}
