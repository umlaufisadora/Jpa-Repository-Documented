package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Representa um dia de observação persistido pela aplicação
 * <p>Esta entidade contém os dados internos utilizados para camada de persistência</p>
 */

@Entity
@Table(name = "observation_day")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class ObservationDay
{
    @Id
    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Long locationId;

    @Id
    @Column(name = "observation_date", nullable = false)
    private Date observationDate;
}
