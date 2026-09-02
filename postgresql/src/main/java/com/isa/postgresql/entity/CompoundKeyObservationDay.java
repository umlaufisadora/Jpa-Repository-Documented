package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Embeddable
@Data
public class CompoundKeyObservationDay implements Serializable
{
    @Id
    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Long locationId;

    @Id
    @Column(name = "observation_date", nullable = false)
    private Date observationDate;
}
