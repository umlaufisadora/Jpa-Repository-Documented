package com.isa.postgresql.controller;

import com.isa.postgresql.dto.LocationResponse;
import com.isa.postgresql.service.LocationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Tag(
        name = "API de controle e monitoramento de casos relacionados à COVID",
        description = "REST API para monitoramento de dados da doença COVID-19 e seus países"
)

/**
 * Controller responsável por controlar os endpoints relacionados à entidade Location
 */

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/locations")
public class LocationController
{
    private final LocationService service;

    @Operation(
            summary = "Listar todas localizações",
            description = "Listar todas as localizações cadastradas no banco de dados"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Requisição retornada com sucesso"
    )
    @GetMapping
    public ResponseEntity<Page<LocationResponse>> listarTodos(@PageableDefault
    (size = 20, direction = Sort.Direction.DESC) Pageable pageable)
    {
        Page<LocationResponse> page = service.listarTudo(pageable);

        return ResponseEntity.ok(page);
    }
}
