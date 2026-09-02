package com.isa.postgresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

/**
 * Representa uma política de observação persistida pela aplicação
 * <p>Esta entiade contém os dados internos utilizados para camada de persistência</p>
 */

@Entity
@Table(name = "policy_observation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PolicyObservation
{
    @EmbeddedId
    private ObservationDay compoundKey;

    @Column(name = "stringency_index", nullable = false)
    private BigDecimal stringencyIndex;
}
