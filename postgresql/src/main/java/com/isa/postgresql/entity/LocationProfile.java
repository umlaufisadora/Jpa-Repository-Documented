package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * Representa o perfil da localização persistido pela aplicação
 * <p>Esta entidade contém os dados internos utilizados para camada de persistência</p>
 */

@Entity
@Table(name = "location_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationProfile
{
    @Id
    @OneToOne
    @JoinColumn(name = "location_id")
    private Long locationId;

    @Column(name = "population", nullable = false)
    private Long population;

    @Column(name = "population_density")
    private BigDecimal populationDensity;

    @Column(name = "median_age")
    private BigDecimal medianAge;

    @Column(name = "aged_65_older")
    private BigDecimal aged65Older;

    @Column(name = "aged_70_older")
    private BigDecimal aged70Older;

    @Column(name = "gpd_per_capita")
    private BigDecimal gpdPerCapita;

    @Column(name = "extreme_poverty")
    private BigDecimal extremePoverty;

    @Column(name = "cardiovascular_death_rate")
    private BigDecimal cardiovascularDeathRate;

    @Column(name = "diabetes_prevalence")
    private BigDecimal diabetesPrevalence;

    @Column(name = "female_smokers")
    private BigDecimal femaleSmokers;

    @Column(name = "male_smokers")
    private BigDecimal maleSmokers;

    @Column(name = "handwashing_facilities")
    private BigDecimal handwashingFacilities;

    @Column(name = "hospital_beds_per_thousand")
    private BigDecimal hospitalBedsPerThousand;

    @Column(name = "life_expetancy")
    private BigDecimal lifeExpetancy;

    @Column(name = "human_development_index")
    private BigDecimal humanDevelopmentIndex;
}
