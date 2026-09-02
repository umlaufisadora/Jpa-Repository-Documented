package com.isa.postgresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "testing_observation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestingObservation
{
    @EmbeddedId
    private ObservationDay compoundKey;

    @Column(name = "total_tests")
    private BigDecimal totalTests;

    @Column(name = "new_tests")
    private BigDecimal newTests;

    @Column(name = "total_tests_per_thousand")
    private BigDecimal totalTestsPerThousand;

    @Column(name = "new_tests_per_thousand")
    private BigDecimal newTestsPerThousand;

    @Column(name = "new_tests_smoothed")
    private BigDecimal newTestsSmoothed;

    @Column(name = "new_tests_smoothed_per_thousand")
    private BigDecimal newTestsSmoothedPerThousand;

    @Column(name = "positive_rate")
    private BigDecimal positiveRate;

    @Column(name = "tests_per_case")
    private BigDecimal testsPerCase;

    @Column(name = "tests_unit_code")
    private String testUnitCode;
}
