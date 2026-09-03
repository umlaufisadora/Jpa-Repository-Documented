package com.isa.postgresql.dto;

import com.isa.postgresql.entity.Location;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

/**
 * Dados retornados de LocationProfile
 * @param locationId Identificador único de LocationProfile
 * @param population número populacional
 * @param populationDensity densidade populacional na localização
 * @param medianAge média de idade
 * @param aged65Older indivíduos com mais de 65 anos de idade
 * @param aged70Older indivíduos com mais de 70 anos de idade
 * @param gpdPerCapita indicador econômico de riqueza
 * @param extremePoverty indicador de extrema pobreza
 * @param cardiovascularDeathRate taxa de mortes cardiovasculares
 * @param diabetesPrevalence população total que têm diabetes
 * @param femaleSmokers porcentagem de mulheres fumantes em uma localização
 * @param maleSmokers porcentagem de homens fumantes em uma localização
 * @param handwashingFacilities instalação para lavagem de mãos
 * @param hospitalBedsPerThousand camas de hospital disponibilizadas para cada mil pessoas
 * @param lifeExpectancy expectativa de vida da população em um local
 * @param humanDevelopmentIndex qualidade de vida medida a partir da longetividade, educação e renda
 */

@Schema(description = "Dados de LocationProfile retornados pela API")
public record LocationProfileResponse(
        @Schema(
                description = "Identificador único de Location",
                example = "1"
        )
        Location locationId,

        @Schema(
                description = "Número populacional",
                example = "12"
        )
        Long population,

        @Schema(
                description = "Densidade populacional na localização",
                example = "23.8 (em hab/km^2"
        )
        BigDecimal populationDensity,

        @Schema(
                description = "Média de idade",
                example = "45"
        )
        BigDecimal medianAge,

        @Schema(
                description = "Indivíduos com mais de 65 anos de idade",
                example = "234"
        )
        BigDecimal aged65Older,

        @Schema(
                description = "Indivíduos com mais de 70 anos de idade",
                example = "100"
        )
        BigDecimal aged70Older,

        @Schema(
                description = "Indicador econômico de riqueza",
                example = "89.7"
        )
        BigDecimal gpdPerCapita,

        @Schema(
                description = "Indicador de extrema pobreza",
                example = "23.2"
        )
        BigDecimal extremePoverty,

        @Schema(
                description = "Taxa de mortes cardiovasculares",
                example = "12"
        )
        BigDecimal cardiovascularDeathRate,

        @Schema(
                description = "População total que têm diabetes",
                example = "14"
        )
        BigDecimal diabetesPrevalence,

        @Schema(
                description = "Porcentagem de mulheres fumantes em uma localização",
                example = "9.8"
        )
        BigDecimal femaleSmokers,

        @Schema(
                description = "Porcentagem de homens fumantes em uma localização",
                example = "13.9"
        )
        BigDecimal maleSmokers,

        @Schema(
                description = "Instalação para lavagem de mãos",
                example = "61"
        )
        BigDecimal handwashingFacilities,

        @Schema(
                description = "Camas de hospital disponibilizadas para cada mil pessoas",
                example = "47"
        )
        BigDecimal hospitalBedsPerThousand,

        @Schema(
                description = "Expectativa de vida da população em um local",
                example = "76.6"
        )
        BigDecimal lifeExpectancy,

        @Schema(
                description = "Qualidade de vida medida a partir da longetividade, educação e renda",
                example = "805"
        )
        BigDecimal humanDevelopmentIndex
) {
}
