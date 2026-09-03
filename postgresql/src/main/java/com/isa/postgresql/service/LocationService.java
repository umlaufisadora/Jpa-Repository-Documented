package com.isa.postgresql.service;

import com.isa.postgresql.dto.LocationProfileResponse;
import com.isa.postgresql.dto.LocationResponse;
import com.isa.postgresql.entity.Location;
import com.isa.postgresql.entity.LocationProfile;
import com.isa.postgresql.exception.NotFoundException;
import com.isa.postgresql.mapper.LocationMapper;
import com.isa.postgresql.mapper.LocationProfileMapper;
import com.isa.postgresql.repository.LocationProfileRepository;
import com.isa.postgresql.repository.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Serviço que centraliza as regras de negócios relacionadas a Location
 */

@Service
@AllArgsConstructor
public class LocationService
{
    private final LocationRepository repository;
    private final LocationMapper mapper;
    private final LocationProfileMapper profileMapper;
    private final LocationProfileRepository profileRepository;

    /**
     * Listar todas as localizações
     * @param pageable página com parâmetros de retorno informado (ex: size=20)
     * @return Página de DTOs {@link LocationResponse} com dados representativos de Location
     */
    @Transactional(readOnly = true)
    public Page<LocationResponse> listarTudo(Pageable pageable)
    {
        return repository.findAll(pageable).map(mapper::toDTO);
    }

    /**
     * Buscar localização a partir do código ISO
     * @param isoCode parâmetro de código Iso usado para pesquisa
     * @return DTO {@link LocationResponse} com dados representativos de Location
     */
    @Transactional(readOnly = true)
    public LocationResponse buscarPorIso(String isoCode)
    {
        return repository.findByIsoCode(isoCode)
                .map(mapper::toDTO)
                .orElseThrow(() -> new NotFoundException("Localização não encontrada pela ISO: " + isoCode));
    }

    /**
     * Retornar dados do perfil da localização a partir do código Iso informado
     * @param isoCode parâmetro de código Iso usado para pesquisa
     * @return DTO {@link LocationProfileResponse} com dados representativos de LocationProfile
     */
    @Transactional(readOnly = true)
    public LocationProfileResponse retornarDadosPorIso(String isoCode)
    {
        Location location = repository.findByIsoCode(isoCode)
                .stream().findFirst()
                .orElseThrow(() -> new NotFoundException("Localização não encontrada pela ISO: " + isoCode));

        return profileRepository.findById(location).map(profileMapper::toDTO)
                .orElseThrow(() -> new NotFoundException("Perfil da localização não encontrada pela ISO: " + isoCode));
    }
}
