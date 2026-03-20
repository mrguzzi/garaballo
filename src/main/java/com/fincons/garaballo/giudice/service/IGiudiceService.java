package com.fincons.garaballo.giudice.service;

import com.fincons.garaballo.giudice.entity.Giudice;

import java.util.List;

public interface IGiudiceService {

    Giudice create(Giudice entity);

    Giudice getById(Integer id);

    List<Giudice> getAll();

    Giudice update(Integer id, Giudice entity);

    void delete(Integer id);
}