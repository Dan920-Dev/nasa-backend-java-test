package com.nasa.prueba.aspirante.dominio.dto;

import lombok.Data;

import java.util.List;

@Data
public class ItemDTO {
    private String href;
    private List<DataDTO> data;
}
