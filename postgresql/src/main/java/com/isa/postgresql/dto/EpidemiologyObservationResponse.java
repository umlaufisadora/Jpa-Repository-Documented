package com.isa.postgresql.dto;

import com.isa.postgresql.entity.ObservationDay;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Dados retornados de EpidemiologyObservation
 * @param compoundKey Identificador composto de ObservationDay
 * @param totalCases Quantidade total de casos
 * @param newCases Novos casos registrados
 * @param newCasesSmoothed Novos casos suavizados
 * @param totalDeaths Número de mortes totais
 * @param newDeathsSmoothed Novas mortes suavizadas
 * @param totalCasesPerMillion Total de casos por milhão
 * @param newCasesPerMillion Novos casos por milhão
 * @param newCasesSmoothedPerMillion Novos casos suavizados por milhão
 * @param totalDeathsPerMillion Total de mortes por milhão
 * @param newDeathsPerMillion Novas mortes por milhão
 * @param newDeathsSmoothedPerMillion Novas mortes suavizadas por milhão
 * @param reproductionRate Taxa de reprodução
 */

@Schema(description = "Dados de uma observação de epidemiologia retornados pela API")
public record EpidemiologyObservationResponse(

        @Schema(
                description = "Identificador composto de Observation Day",
                example = "1 2026-09-01"
        )
        ObservationDay compoundKey,

        @Schema(
                description = "Quantidade total de casos",
                example = "40500"
        )
        Long totalCases,

        @Schema(
                description = "Novos casos registrados",
                example = "16"
        )
        Long newCases,

        @Schema(
                description = "Novos casos suavizados",
                example = "5"
        )
        Long newCasesSmoothed,

        @Schema(
                description = "Número de mortes totais",
                example = "1005"
        )
        Long totalDeaths,

        @Schema(
                description = "Novas mortes suavizadas",
                example = "210"
        )
        Long newDeathsSmoothed,

        @Schema(
                description = "Total de casos por milhão",
                example = "41"
        )
        Long totalCasesPerMillion,

        @Schema(
                description = "Novos casos por milhão",
                example = "7"
        )
        Long newCasesPerMillion,

        @Schema(
                description = "Novos casos suavizados por milhão",
                example = "5"
        )
        Long newCasesSmoothedPerMillion,

        @Schema(
                description = "Mortes totais por milhão",
                example = "20"
        )
        Long totalDeathsPerMillion,

        @Schema(
                description = "Novas mortes por milhão",
                example = "3"
        )
        Long newDeathsPerMillion,

        @Schema(
                description = "Novas mortes suavizadas por milhão",
                example = "2"
        )
        Long newDeathsSmoothedPerMillion,

        @Schema(
                description = "Taxa de reprodução (disseminação)",
                example = "2.7"
        )
        BigDecimal reproductionRate
) {
}
