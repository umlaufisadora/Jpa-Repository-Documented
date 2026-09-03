package com.isa.postgresql.repository;

import com.isa.postgresql.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositório de Location que irá se conectar com a tabela 'location' no banco de dados
 */

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>
{
    /**
     * Função de pesquisa no bando de dados para encontrar entidade
     * Location a partir do isoCode no banco de dados
     * @param isoCode parâmetro utilizado para pesquisa
     * @return Pode retornar uma entidade Location com isoCode coincidente
     */
    Optional<Location> findByIsoCode(String isoCode);
}
