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
public class ObservationDay
{
    @EmbeddedId
    private CompoundKeyObservationDay compoundKey;
}
