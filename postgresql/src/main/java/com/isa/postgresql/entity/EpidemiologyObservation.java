package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "epidemiology_observation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EpidemiologyObservation
{
    @EmbeddedId
    private CompoundKeyObservationDay compoundKey;

    @Column(name = "total_cases")
    private Long totalCases;

    @Column(name = "new_cases")
    private Long newCases;

    @Column(name = "new_cases_smoothed")
    private Long newCasesSmoothed;

    @Column(name = "total_deaths")
    private Long totalDeaths;

    @Column(name = "new_cases_smoothed")
    private Long newDeathsSmoothed;

    @Column(name = "total_cases_per_million")
    private Long totalCasesPerMillion;

    @Column(name = "new_cases_per_million")
    private Long newCasesPerMillion;

    @Column(name = "new_cases_smoothed_per_million")
    private Long newCasesSmoothedPerMillion;

    @Column(name = "total_deaths_per_million")
    private Long totalDeathsPerMillion;

    @Column(name = "new_deaths_per_million")
    private Long newDeathsPerMillion;

    @Column(name = "new_deaths_smoothed_per_million")
    private Long newDeathsSmoothedPerMillion;

    @Column(name = "reproduction_rate")
    private BigDecimal reproductionRate;
}
