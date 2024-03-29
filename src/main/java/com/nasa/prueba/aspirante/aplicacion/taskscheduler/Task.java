package com.nasa.prueba.aspirante.aplicacion.taskscheduler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import com.nasa.prueba.aspirante.dominio.service.implementation.DataImpl;
import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class Task {

    private PruebaClienteRest test;
    private DataImpl dataService;
    ObjectMapper objectMapper;

    @Scheduled( fixedRate = 60000)
    public void task(){
        try{
            ApiResponseDTO response = objectMapper.readValue(test.getDataToAPI(), ApiResponseDTO.class);
            dataService.save(response);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error executing task");
        }
    }
}
