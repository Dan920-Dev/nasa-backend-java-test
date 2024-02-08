package com.nasa.prueba.aspirante.dominio.service.implementation;

import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.dominio.service.DataService;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataImpl implements DataService {
    @Autowired
    private PruebaInterfaz repository;

    @Override
    public void save(ApiResponseDTO response){

        PruebaEntity newData = new PruebaEntity();
        newData.setHref(response.getCollection().getItems().get(0).getHref());
        newData.setTitle(response.getCollection().getItems().get(0).getData().get(0).getTitle());
        newData.setCenter(response.getCollection().getItems().get(0).getData().get(0).getCenter());
        newData.setNasaId(response.getCollection().getItems().get(0).getData().get(0).getNasaId());

        repository.save(newData);
    }

    @Override
    public List<PruebaEntity> getAll(){
        return repository.findAllByOrderByIdDesc();
    }

}
