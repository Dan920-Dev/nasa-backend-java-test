package com.nasa.prueba.aspirante.aplicacion.taskscheduler;


import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PruebaTask {

    private PruebaClienteRest test;

    @Scheduled( fixedRate = 60000)
    public void task(){
        System.out.println("Se realizo accion..");
        // ApiResponseDTO response = test.getDataToAPI();
    }
}
