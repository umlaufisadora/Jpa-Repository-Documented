package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

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
