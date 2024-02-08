package com.nasa.prueba.aspirante.dominio.service;

import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

import java.util.List;

public interface DataService {

    void save(ApiResponseDTO response);

    List<PruebaEntity> getAll();
}
