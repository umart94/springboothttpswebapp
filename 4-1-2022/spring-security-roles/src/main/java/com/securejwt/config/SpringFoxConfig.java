package com.securejwt.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ConditionalOnProperty(name = "swagger.enabled", havingValue = "true", matchIfMissing = false)
@EnableSwagger2
public class SpringFoxConfig {                                    
	@Value("${api.title}")
    private String title;

    @Value("${api.version}")
    private String version;

    @Value("${api.description}")
    private String description;

    @Value("${api.name}")
    private String name;

    @Value("${api.link}")
    private String link;

    @Value("${api.email}")
    private String email;
    
    @Bean
    public Docket api() {
    	return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.securejwt")).build().apiInfo(apiDetails())
				.securitySchemes(Arrays.asList(apiKey()));
               	
    }
    
    private ApiInfo apiDetails() {
		return new ApiInfoBuilder().title(title).description(description).version(version)
				.contact(new Contact(name, link, email)).build();
	}
    
    private ApiKey apiKey() { 
    	return new ApiKey("jwtToken", "Authorization", "header");
    }
}