package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.PartecipanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartecipanteRepository extends JpaRepository<PartecipanteEntity, Long> {}
