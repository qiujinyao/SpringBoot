package com.qianfeng.springboot.webConfig;

import com.qianfeng.springboot.Filter.MyFilter;
import com.qianfeng.springboot.Listenner.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/30
 */
@Configuration
 public  class WebConfig {
      @Autowired
      private MyFilter myFilter;
      @Autowired
      private MyListener  myListener;

      @Bean
      public FilterRegistrationBean init(){
          FilterRegistrationBean bean=new FilterRegistrationBean();
          bean.setFilter(myFilter);
          bean.setName("myfilter");
          bean.addUrlPatterns("/*");
          return bean;
      }
      @Bean
      public ServletListenerRegistrationBean getListenerBean(){
          ServletListenerRegistrationBean registrationBean=new ServletListenerRegistrationBean();
          registrationBean.setListener(myListener);
          return  registrationBean;
      }

}
