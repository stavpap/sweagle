package com.syntax.sweagleapi.controller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.syntax.sweagleapi.utils.MappingYamlConverter;

/**
 * Class for exposing our yaml converter as a spring bean.
 */
@Configuration
public class YamlConfig {

    @Bean
    public MappingYamlConverter yamlHttpMessageConverter() {

        YAMLMapper mapper = new YAMLMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        return new MappingYamlConverter(mapper);
    }
}
