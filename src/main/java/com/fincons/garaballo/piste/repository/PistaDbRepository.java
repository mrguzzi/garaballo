package com.fincons.garaballo.piste.repository;

import com.fincons.garaballo.piste.entity.PistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface PistaDbRepository extends JpaRepository<PistaEntity,Integer> {

}
