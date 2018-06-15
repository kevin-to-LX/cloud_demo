package com.kevin.config;

import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinyugai on 2018/6/14.
 * 创建cas配置类
 */
@Configuration
@EnableCasClient

public class CasConfigure extends CasClientConfigurerAdapter {
    @Override
    public void configureAuthenticationFilter(FilterRegistrationBean authenticationFilter) {
        authenticationFilter.getInitParameters().put("authenticationRedirectStrategyClass","com.patterncat.CustomAuthRedirectStrategy");
        /**其中authenticationRedirectStrategyClass可以用来指定自定义的redirect策略。*/
    }
}
