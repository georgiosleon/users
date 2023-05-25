package com.gleon.usersapi.configs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public HttpTraceRepository httpTraceRepository() {
        return new InMemoryHttpTraceRepository();
    }


    @Bean
    CommonsRequestLoggingFilter loggingFilter(){
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        // Logging Client IP Information
        loggingFilter.setIncludeClientInfo(true);
        // Record request header
        loggingFilter.setIncludeHeaders(true);
        // If the request header is logged, you can specify which records are logged and which are not
        // loggingFilter.setHeaderPredicate();
        // Log the request body, especially the body parameter of the POST request
        loggingFilter.setIncludePayload(true);
        // Size limit of request body Default 50
        loggingFilter.setMaxPayloadLength(10000);
        //Record query parameters in the request path
        loggingFilter.setIncludeQueryString(true);
        return loggingFilter;
    }



}
