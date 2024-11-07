package com.produtos.apirest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("Produtos API REST")
                    .description("API REST de cadastro de produtos.")
                    .version("1.0")
                    .termsOfService("Terms of Service")
                    .contact(new Contact()
                        .name("Charles Santos de Macedo")
                        .url("ChaarlesSantos - Instagram")
                        .email("charlesfarmaanddev@gmail.com"))
                    .license(new License()
                        .name("Apache License Version")
                        .url("https://www.apache.org/licenses/LICENSE")));
    }
}
