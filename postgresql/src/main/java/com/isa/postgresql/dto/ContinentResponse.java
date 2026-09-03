package com.isa.postgresql.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Dados retornados de Continent
 * @param continendId Identificador único do continente
 * @param name Nome do continente
 */

@Schema(description = "Dados de um continente retornados pela API")
public record ContinentResponse(

        @Schema(
                description = "Identificador único do filme",
                example = "1"
        )
        Short continendId,

        @Schema(
                description = "Nome do continente",
                example = "América do Sul"
        )
        String name
) {
}
