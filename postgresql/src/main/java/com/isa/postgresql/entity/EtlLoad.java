package com.isa.postgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

/**
 * Representa uma carga ETL persistida pela aplicação
 * <p>Esta entidade contém os dados internos utilizados para camada de persistência</p>
 * */
@Entity
@Table(name = "etl_load")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EtlLoad
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "load_id")
    private Long loadId;

    @Column(name = "source_filename", length = 255, nullable = false)
    private String sourceFilename;

    @Column(name = "raw_row_count", nullable = false)
    private Long rawRowCount;

    @Column(name = "normalized_day_count", nullable = false)
    private Long normalizedDayCount;

    @Column(name = "complementary_duplicate_count", nullable = false)
    private Long complementaryDuplicateCount;

    @Column(name = "loaded_at", nullable = false)
    private ZonedDateTime loadedAt;
}
