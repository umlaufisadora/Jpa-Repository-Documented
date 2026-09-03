package com.isa.postgresql.mapper;

import com.isa.postgresql.dto.LocationProfileResponse;
import com.isa.postgresql.entity.LocationProfile;
import org.springframework.stereotype.Component;

@Component
public class LocationProfileMapper
{
    /**
     * Mapper para transformar uma entidade de location em response (DTO)
     * @param locationProfile Entidade com dados de Location a ser convertida
     * @return Response de Location
     */
    public LocationProfileResponse toDTO(LocationProfile locationProfile)
    {
        return new LocationProfileResponse(
                locationProfile.getLocationId(),
                locationProfile.getPopulation(),
                locationProfile.getPopulationDensity(),
                locationProfile.getMedianAge(),
                locationProfile.getAged65Older(),
                locationProfile.getAged70Older(),
                locationProfile.getGpdPerCapita(),
                locationProfile.getExtremePoverty(),
                locationProfile.getCardiovascularDeathRate(),
                locationProfile.getDiabetesPrevalence(),
                locationProfile.getFemaleSmokers(),
                locationProfile.getMaleSmokers(),
                locationProfile.getHandwashingFacilities(),
                locationProfile.getHospitalBedsPerThousand(),
                locationProfile.getLifeExpetancy(),
                locationProfile.getHumanDevelopmentIndex()
        );
    }
}
