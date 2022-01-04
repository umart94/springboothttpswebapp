package com.securejwt.config;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.securejwt.controller.ApiController;
import com.securejwt.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	CustomUserDetailsService userDetailsService;
	
	@Autowired
	private CustomJwtAuthenticationFilter customJwtAuthenticationFilter;
	
	@Autowired
  	private JwtAuthenticationEntryPoint unauthorizedHandler;
	
	@Value("${springfox.documentation.swagger.v2.path:#{null}}")
    private String swaggerApiDocsPath;
    
    @Value("${swagger.enabled:false}")
    private Boolean swaggerEnabled;
	
	@Bean
	public static PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requiresChannel().anyRequest().requiresSecure().and().csrf().disable()
		.authorizeRequests().antMatchers(ApiController.ADMIN_URL+"/**").hasRole("ADMIN")
		.antMatchers(ApiController.USER_URL+"/**").hasAnyRole("USER","ADMIN")
		.antMatchers(anonymousEndpoints()).permitAll()
		.antMatchers("/**")
		.authenticated()
		.anyRequest().authenticated()
		//if any exception occurs call this
		.and().exceptionHandling()
        .authenticationEntryPoint(unauthorizedHandler).and().
		// make sure we use stateless session; session won't be used to
		// store user's state.
		sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

// 		Add a filter to validate the tokens with every request
		http.addFilterBefore(customJwtAuthenticationFilter, 
		UsernamePasswordAuthenticationFilter.class);
		
	}
	
	private String[] anonymousEndpoints() {
        String endpoints[] = {
            ApiController.AUTHENTICATE_URL,
            ApiController.REGISTER_URL,
            ApiController.REFRESH_TOKEN,
            ApiController.SWAGGER_URL,
            "/api/v1/customer/customerinquiry",
            "/.well-known/**"
        };
        
        if (swaggerEnabled) {
            String swaggerEndpoints[] = {
                "/swagger-ui.html",
                swaggerApiDocsPath,
                "/webjars/**",
                "/swagger-resources/**",
                "/swagger-ui/**",
                "v3/api-docs/**",
                "/docs/**"
            };
            endpoints = ArrayUtils.addAll(endpoints, swaggerEndpoints);
        }
        
        return endpoints;
    }
}
