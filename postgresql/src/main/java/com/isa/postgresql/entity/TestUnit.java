package com.isa.postgresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "test_unit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestUnit
{
    @Id
    @Column(name = "test_unit_code", length = 30)
    private UUID testUnitCode;

    @Column(name = "description", length = 100)
    private String description;
}
