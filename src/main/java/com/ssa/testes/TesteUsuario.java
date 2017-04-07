package com.ssa.testes;

import com.ssa.TipoUsuario;
import com.ssa.Usuario;
import com.ssa.repositorio.UsuarioRepositorio;

public class TesteUsuario {

	public static void main(String[] args) {
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		Usuario usuario = new Usuario();
		TipoUsuario tipo = new TipoUsuario();
		
		tipo.setId(1);
		
		usuario.setNome("Joana Do Bondelouco");
		usuario.setCpf(231546555);
		usuario.setMatricula(56464);
		usuario.setLogin("joana");
		usuario.setSenha("joaninhaehnois");
		usuario.setTipoUsuario(tipo);
		
		repositorio.salvarUsuario(usuario);

	}

}
