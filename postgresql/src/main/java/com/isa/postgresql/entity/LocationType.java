package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

/**
 * Representa um tipo de localização persistido pela aplicação
 * <p>Esta entidade contém os dados internos utilizados pela camada de persistência</p>
 */

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_type_code", nullable = false, length = 30)
    private UUID locationTypeCode;

    @Column(name = "description", nullable = false, length = 150)
    private String description;

}
