package com.isa.postgresql.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Map;

@Schema(description = "Estrutura padronizada para respostas de erro da API")
public record ErrorResponseDTO(

        @Schema(
                description = "Status HTTP de erro",
                example = "404"
        )
        Integer status,

        @Schema(
                description = "Mensagem de erro simplificada",
                example = "ISO não encontrada"
        )
        String error,

        @Schema(
                description = "Mensagem detalhada de erro",
                example = "ISO não encontrada pelo ID informado"
        )
        String message,

        @Schema(
                description = "URL da requisição que originou o erro",
                example = "api/v1/locations/{isoCode}"
        )
        String caminho,

        @Schema(
                description = "Data e horário em que o erro ocorreu",
                example = "26/08/2026T16:01"
        )
        LocalDateTime timestamp
) {

    /**
     * Construtor utilitário para gerar a resposta atribuindo a hora atual automaticamente
     * @param status código de status HTTP
     * @param erro mensagem simples de erro
     * @param message mensagem detalhada de erro
     * @param caminho URL da requisição que gerou o erro
     * @return ErrorResponseDTO
     */
    public static ErrorResponseDTO criar(Integer status, String erro, String message, String caminho)
    {
        return new ErrorResponseDTO(status, erro, message, caminho, LocalDateTime.now());
    }
}
