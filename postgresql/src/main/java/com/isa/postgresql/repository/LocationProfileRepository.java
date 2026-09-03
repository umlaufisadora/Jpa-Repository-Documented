package com.isa.postgresql.repository;

import com.isa.postgresql.entity.Location;
import com.isa.postgresql.entity.LocationProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationProfileRepository extends JpaRepository<LocationProfile,Location > {
}
