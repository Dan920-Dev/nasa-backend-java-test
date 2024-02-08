package com.nasa.prueba.aspirante.infraestructura.repository;

import com.nasa.prueba.aspirante.dominio.entities.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {

    List<DataEntity> findAllByOrderByIdDesc();
}
