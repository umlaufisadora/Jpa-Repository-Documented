package com.isa.postgresql.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configurações globais de documentação OpenAPI (Swagger)
 */

@Configuration
public class OpenApiConfig
{
    @Bean
    public OpenAPI customOpenAPI()
    {
        return new OpenAPI()
                .info(new Info()
                        .title("Api de Dados Consolidados da pandemia de COVID-19")
                        .version("1.0")
                        .description("API RESTFul desenvolvida para controle dos dados pandêmicos")
                        .contact(new Contact()
                                .name("Isadora Umlauf")
                                .email("isadora_umlauf@estudante.sesisenai.org.br"))
                );
    }
}
