package com.isa.postgresql.repository;

import com.isa.postgresql.entity.Location;
import com.isa.postgresql.entity.LocationProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório de LocationProfile que irá se conectar com a tabela 'location_profile' no banco de dados
 */

@Repository
public interface LocationProfileRepository extends JpaRepository<LocationProfile,Location > {
}
