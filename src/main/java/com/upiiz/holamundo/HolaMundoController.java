package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/categorias")
public class HolaMundoController {

    @GetMapping
    public String getAllCategorias() {
        return "Listado de todos los categorias con GET";
    }

    @GetMapping("/{id}")
    public String getCategoriaById(@PathVariable int id) {
        return "Hola Mundo de las API's DOS con el Metodo GET con id id= "+id;
    }

    @PostMapping
    public String createCategoria(@RequestBody String categoria) {
        return "Creando la categoria: "+categoria;
    }

}
