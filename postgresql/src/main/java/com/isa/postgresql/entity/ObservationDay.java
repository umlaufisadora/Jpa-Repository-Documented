package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
