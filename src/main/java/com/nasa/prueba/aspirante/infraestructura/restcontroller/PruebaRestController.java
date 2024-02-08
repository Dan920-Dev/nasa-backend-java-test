package com.nasa.prueba.aspirante.infraestructura.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nasa/test/")
public class PruebaRestController {
    // This is a template

    @GetMapping("getAll")
    ResponseEntity<?> getAllData(){
        return new ResponseEntity<>("Test Done",HttpStatus.ACCEPTED);
    }
}
