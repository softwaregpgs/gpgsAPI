package com.gpgs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("empresas")
@AllArgsConstructor
@Data
public class Empresa {

    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String nombre;
}
