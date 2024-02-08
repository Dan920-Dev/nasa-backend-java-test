package com.nasa.prueba.aspirante.dominio.dto;

import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
public class ApiResponseDTO {
    private CollectionDTO collection;
    private List<ItemDTO> items;
}
