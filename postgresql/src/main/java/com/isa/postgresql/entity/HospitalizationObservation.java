package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "hospitalization_observation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HospitalizationObservation
{
    @EmbeddedId
    private ObservationDay compoundKey;

    @Column(name = "icu_patients")
    private BigDecimal icuPatients;

    @Column(name = "icu_patients_per_million")
    private BigDecimal icuPatientsPerMillion;

    @Column(name = "hosp_patients")
    private BigDecimal hospPatients;

    @Column(name = "hosp_patients_per_million")
    private BigDecimal hospPatientsPerMillion;

    @Column(name = "weekly_icu_admissions")
    private BigDecimal weeklyIcuAdmissions;

    @Column(name = "weekly_icu_admissions_per_million")
    private BigDecimal weeklyIcuAdmissionsPerMillion;

    @Column(name = "weekly_hosp_admission")
    private BigDecimal weeklyHospAdmission;

    @Column(name = "weekly_hosp_admission_per_million")
    private BigDecimal weeklyHospAdmissionPerMillion;
}
