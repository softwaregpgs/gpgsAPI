package com.gpgs.repositories;

import com.gpgs.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepository extends MongoRepository<Empresa,String> {

}
