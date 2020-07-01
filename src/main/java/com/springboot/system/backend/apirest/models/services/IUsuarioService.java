package com.springboot.system.backend.apirest.models.services;

import com.springboot.system.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
