package com.nasa.prueba.aspirante.infraestructura.clientrest;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;



@Service
public class PruebaClienteRest {

    private final RestTemplate restTemplate = new RestTemplate();


    public String getDataToAPI() {

        try {
            String url = "https://images-api.nasa.gov/search?q=";

            return restTemplate.getForObject(url + "apollo 11", String.class);

        }catch (HttpStatusCodeException e){

            if(e.getStatusCode().equals(HttpStatus.BAD_REQUEST))
                throw new RuntimeException("The request was unacceptable, required parameter");
            if(e.getStatusCode().equals(HttpStatus.NOT_FOUND))
                throw new RuntimeException("Resource Doesn't exist");
            else
                throw new RuntimeException("Something went wrong on the external API");
        }

    }

}
