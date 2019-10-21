package com.syntax.sweagleapi.utils;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Custom message converter for (de)serializing Java Objects to yaml over http
 */
public class MappingYamlConverter extends AbstractJackson2HttpMessageConverter {

    public MappingYamlConverter(ObjectMapper objectMapper) {
        super(objectMapper, MediaType.parseMediaType("application/x-yaml"));
    }
}
