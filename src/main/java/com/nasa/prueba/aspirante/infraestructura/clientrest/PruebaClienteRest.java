package com.nasa.prueba.aspirante.infraestructura.clientrest;

import com.nasa.prueba.aspirante.dominio.dto.ApiResponseDTO;
import org.springframework.web.client.RestTemplate;

public class PruebaClienteRest {
    String url = "https://images-api.nasa.gov/search?q=apollo%2011";
    private final RestTemplate restTemplate = new RestTemplate();

    private ApiResponseDTO getDataToAPI(){
        return restTemplate.getForObject(url, ApiResponseDTO.class);
    }


}
