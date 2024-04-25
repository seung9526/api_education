package com.example.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1-definition")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI springBlogOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Lasuri Project API")
                        .description("Lasuri 프로젝트 API 명세서")
                        .version("v1.0.0")
                );
    }
}