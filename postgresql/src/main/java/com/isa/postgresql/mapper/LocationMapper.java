package com.isa.postgresql.mapper;

import com.isa.postgresql.dto.LocationResponse;
import com.isa.postgresql.entity.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper
{
    /**
     * Mapper para transformar entidade em  LocationResponse (DTO)
     * @param location entity Entidade com dados de Location a ser convertida
     * @return Response de Location (DTO)
     */
    public LocationResponse toDTO(Location location)
    {
        return new LocationResponse(
                location.getLocationId(),
                location.getIsoCode(),
                location.getName(),
                location.getContinentId(),
                location.getLocationTypeCode());
    }
}
