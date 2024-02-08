package com.nasa.prueba.aspirante.infraestructura.restcontroller;


import com.nasa.prueba.aspirante.dominio.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/nasa/test/")
public class RestController {

    @Autowired
    DataService dataService;

    @GetMapping("getAll")
    ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(dataService.getAll(),HttpStatus.ACCEPTED);
    }
}
