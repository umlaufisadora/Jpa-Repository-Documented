package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "excess_mortality_observation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExcessMortalityObservation
{
    @EmbeddedId
    private ObservationDay compoundKey;

    @Column(name = "excess_mortality_absolute")
    private BigDecimal excessMortalityAbsolute;

    @Column(name = "excess_mortality_cumulative")
    private BigDecimal excessMortalityCumulative;

    @Column(name = "excess_mortality")
    private BigDecimal excessMortality;

    @Column(name = "excess_mortality_cumulative_per_million")
    private BigDecimal excessMortalityCumulativePerMillion;
}
