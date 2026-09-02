package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "location_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationType
{
    @Id
    //Fazer a geração na Service
    @Column(name = "location_type_code", nullable = false, length = 30)
    private UUID locationTypeCode;

    @Column(name = "description", nullable = false, length = 150)
    private String description;

}
