package com.fincons.garaballo.giudice.repository;

import com.fincons.garaballo.giudice.entity.Giudice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiudiceRepository extends JpaRepository<Giudice, Integer> {
}