package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Representa uma localização persistida pela aplicação
 * <p>Esta entidade contém os dados internos utilizados para camada de persistência</p>
 * */

@Entity
@Table(name = "location")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "iso_code", nullable = false, length = 12)
    private String isoCode;

    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Short continentId;

    @OneToOne
    @JoinColumn(name = "location_type_code")
    private String locationTypeCode;
}
