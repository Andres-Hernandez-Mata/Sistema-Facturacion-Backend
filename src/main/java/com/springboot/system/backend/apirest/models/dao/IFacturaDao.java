package com.springboot.system.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.system.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
