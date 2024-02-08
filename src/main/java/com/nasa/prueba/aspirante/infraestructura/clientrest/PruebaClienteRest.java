package com.nasa.prueba.aspirante.infraestructura.clientrest;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class PruebaClienteRest {

    private final RestTemplate restTemplate = new RestTemplate();


    public String getDataToAPI() {

        String url = "https://images-api.nasa.gov/search?q=";
        System.out.println(url);

       return  restTemplate.getForObject(url + "apollo 11", String.class);
    }

}
