package com.isa.postgresql.dto;

import com.isa.postgresql.entity.Continent;
import com.isa.postgresql.entity.LocationType;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Atributos devolvidos pela resposta de gerenciamento de Location
 * @param locationId Identificador único de Location
 * @param isoCode Identificação padronizada da localização
 * @param name Nome da localização
 * @param continent Continente da localização
 * @param locationTypeCode ID gerado para identificar o tipo de localização
 */

@Schema(description = "Dados de uma Location retornados pela API")
public record LocationResponse(

        @Schema(
                description = "Identificador único de Location",
                example = "1"
        )
        Long locationId,

        @Schema(
                description = "Identificação padronizada da localização",
                example = "BR (Brasil, ISO 3166)"
        )
        String isoCode,

        @Schema(
                description = "Nome da localização",
                example = "Brasil"
        )
        String name,

        @Schema(
                description = "Continente da localização",
                example = "América do Sul"
        )
        Continent continent,

        @Schema(
                description = "ID gerado para identificar o tipo de localização",
                example = "1"
        )
        LocationType locationTypeCode
)
{
}
