package com.example.TeamProject.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI().info(new Info()
                .title("Mediconnect API")
                .description("API for managing the patient booking for the doctor and the secretary")
                .version("0.0.1")
                .contact(new Contact()
                        .name("Java 11 First Group")
                        .url("http://www.develhope.co/"))
        ).externalDocs(new ExternalDocumentation()
                .description("Mediconnect Github")
                .url("https://github.com/GiulioPesto/MediConnect")
        );
    }
}
