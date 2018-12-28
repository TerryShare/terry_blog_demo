package com.terry.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 安全控制类
 * @author pengfei.liu
 *
 */
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
	//定义常量 KEY 
	private static final String KEY="Terry.com";
	//注入UserDetailsService,进行账号密码的验证
	@Autowired
	private UserDetailsService UserDetailsService;
	
	@Autowired
	private PasswordEncoder PasswordEncoder;
	
	/**
	 * 实现bcrypt加密
	 * @return
	 */
	@Bean
	public PasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider AuthenticationProvider() {
		DaoAuthenticationProvider authenticationProvider= new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(UserDetailsService);
		authenticationProvider.setPasswordEncoder(PasswordEncoder);
		return authenticationProvider;
	}
	
	/**
	 * 自定义配置
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeRequests()
		.antMatchers("/css/**","/js/**","/fonts/**","/index").permitAll()
		.antMatchers("/admins/**").hasRole("ADMIN")
		.and()
		.formLogin().loginPage("/login").failureUrl("/login-error")
		.and().rememberMe().key(KEY)
		.and().exceptionHandling().accessDeniedPage("/403");				
	}
	
	/**
	 * 实现认证
	 */
	@Autowired
	public void  configureGlobal(AuthenticationManagerBuilder auth)throws Exception {
		auth.userDetailsService(UserDetailsService);
		auth.authenticationProvider(AuthenticationProvider());
		
	}
	
}
