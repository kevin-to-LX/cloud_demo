package com.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RestController
public class ZuulDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZuulDemoApplication.class, args);
	}

	/*@GetMapping("/")
	public String welcome(){
		return "welcome";
	}

	@RequestMapping("/user")
	public Principal user(Principal user){
		return user;
	}

	@Component
	@EnableOAuth2Sso // 实现基于OAuth2的单点登录,SecurityConfiguration将会添加身份验证过滤器和身份验证入口
	public static class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.
					antMatcher("*")
					*//* * 所有请求都得经过认证和授权 *//*
					.authorizeRequests().anyRequest().authenticated()
					.and().authorizeRequests().antMatchers("/","/anon")
					.permitAll()
					.and()
			*//** 这里之所以要禁用csrf，是为了方便。
				否则，退出链接必须要发送一个post请求，请求还得带csrf token
			 	那样我还得写一个界面，发送post请求*//*

					.csrf().disable()
			// 退出的URL是/logout
					.logout().logoutUrl("/logout").permitAll()
				*//**	退出成功后，跳转到/路径。*//*
					.logoutSuccessUrl("/login");


		}
	}
*/
}
