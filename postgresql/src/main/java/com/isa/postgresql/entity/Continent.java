package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Representa um continente persistido pela aplicação
 * <p>Esta entidade contém os dados iternos utilizados para camada de persistência</p>
 * */

@Entity
@Table(name = "continent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Continent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id", nullable = false)
    private Short continentId;

    @Column(name = "name", nullable = false)
    private String name;
}
