package com.syntax.sweagleapi.controller.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class is for implementing content negotiation, in order to be able to determine 
 * the media type of the response of our api by using URL parameter mediaType in the request
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

	 @Override
	    public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
	        configurer.favorPathExtension(true)
	            .favorParameter(true)
	            .parameterName("mediaType")
	            .ignoreAcceptHeader(false)
	            .useRegisteredExtensionsOnly(false)
	            .defaultContentType(MediaType.APPLICATION_JSON)
	            .mediaType("yaml", MediaType.valueOf("application/x-yaml"))
	            .mediaType("json", MediaType.APPLICATION_JSON);
	    }
}
