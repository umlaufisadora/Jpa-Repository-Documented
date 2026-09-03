package com.isa.postgresql.controller;

import com.isa.postgresql.dto.ErrorResponseDTO;
import com.isa.postgresql.dto.LocationProfileResponse;
import com.isa.postgresql.dto.LocationResponse;
import com.isa.postgresql.entity.Location;
import com.isa.postgresql.service.LocationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    /**
     * Listar todas as localizações
     * @param pageable página com parâmetros de retorno informados (ex: size=20)
     * @return Resposta de êxito com JSON informado
     */
    @GetMapping
    public ResponseEntity<Page<LocationResponse>> listarTodos(@PageableDefault
    (size = 20, direction = Sort.Direction.DESC) Pageable pageable)
    {
        Page<LocationResponse> page = service.listarTudo(pageable);

        return ResponseEntity.ok(page);
    }

    @Operation(
            summary = "Buscar localização por código ISO",
            description = "Buscar localização cujo código ISO condiz"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Localização encontrada pelo isoCode informado"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Localização não encontrada pelo isoCode informado",
                    content = @Content(schema = @Schema(implementation = ErrorResponseDTO.class))
            )
    })
    /**
     * Buscar localização por isoCode
     * @param isoCode parâmetro utilizado para pesquisa
     * @return Resposta de êxito com JSON informado
     */
    @GetMapping("/{isoCode}")
    public ResponseEntity<LocationResponse> buscarPorIso(@PathVariable String isoCode)
    {
        return ResponseEntity.ok(service.buscarPorIso(isoCode));
    }

    @Operation(
            summary = "Retornar perfil por Iso Code",
            description = "Retornar perfil da localização a partir do Iso Code informado"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Perfil da localização encontrado com sucesso"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Perfil não encontrado pelo IsoCode informado",
                    content = @Content(schema = @Schema(implementation = ErrorResponseDTO.class))
            )
    })
    /**
     * Expor dados do perfil da localização por isoCode
     * @param isoCode parâmetro utilizado para pesquisa
     * @return Resposta de êxito com JSON informado
     */
    @GetMapping("/{isoCode}/profile")
    public ResponseEntity<LocationProfileResponse> retornoDePerfil(@PathVariable String isoCode)
    {
        return ResponseEntity.ok(service.retornarDadosPorIso(isoCode));
    }
}
