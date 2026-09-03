package com.isa.postgresql.repository;

import com.isa.postgresql.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório de Continent que irá se conectar com a tabela 'continent' no banco de dados
 */

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Short> {
}
