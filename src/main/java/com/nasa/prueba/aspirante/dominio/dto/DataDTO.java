package com.nasa.prueba.aspirante.dominio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataDTO {
    private String center;
    private String title;
    @JsonProperty("nasa_id")
    private String nasaId;
}
