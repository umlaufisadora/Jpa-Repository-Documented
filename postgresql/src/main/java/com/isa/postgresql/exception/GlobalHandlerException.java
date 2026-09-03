package com.isa.postgresql.exception;

import com.isa.postgresql.dto.ErrorResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Tratamento de erros com status HTTP em formato JSON em todos os casos de erros previstos para o usuário final
 */
@RestControllerAdvice
public class GlobalHandlerException
{
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleNotFound (EntityNotFoundException ex,
                                                            HttpServletRequest request)
    {
        ErrorResponseDTO error = ErrorResponseDTO.criar(
                HttpStatus.NOT_FOUND.value(),
                "Recurso Não encontrado",
                ex.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
