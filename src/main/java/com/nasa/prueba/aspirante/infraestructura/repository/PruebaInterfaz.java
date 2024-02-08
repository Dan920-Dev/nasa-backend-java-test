package com.nasa.prueba.aspirante.infraestructura.repository;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PruebaInterfaz extends JpaRepository<PruebaEntity, Long> {

    List<PruebaEntity> findAllByOrderByIdDesc();
}
