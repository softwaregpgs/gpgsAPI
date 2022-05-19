package com.gpgs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped;

import java.util.List;

@Document("clientes")
@AllArgsConstructor
@Data
public class Cliente {

    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String nombre;
    private String apellidos;

}
