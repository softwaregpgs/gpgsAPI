package com.gpgs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped;

import java.util.List;

@Document("empresas")
@AllArgsConstructor
@Data
public class Empresa {

    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String cif;
    private String nombre;
    private String descripcion;
    private Integer telefono;
    private String direccion;
    private String enlaceWeb;
    private List<String> categorias;
    private List<String> fotos;

}
