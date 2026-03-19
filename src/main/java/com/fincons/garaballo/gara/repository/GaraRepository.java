package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.GaraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaraRepository extends JpaRepository<GaraEntity, Integer> {
}
