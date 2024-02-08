package com.nasa.prueba.aspirante.dominio.service;

import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import com.nasa.prueba.aspirante.dominio.entities.DataEntity;

import java.util.List;

public interface DataService {

    void save(ApiResponseDTO response);

    List<DataEntity> getAll();
}
