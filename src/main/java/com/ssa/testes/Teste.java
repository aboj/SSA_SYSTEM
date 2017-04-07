package com.ssa.testes;

import com.ssa.repositorio.UsuarioRepositorio;
import com.ssa.Usuario;



public class Teste {

	public static void main(String[] args) {

		UsuarioRepositorio respositorioUsuario = new UsuarioRepositorio();
		Usuario usuario = new Usuario();
		usuario.setNome("Fulano da Silva");
		usuario.setLogin("fulano");
		usuario.setSenha("1234");
		usuario.setMatricula(13410);
		usuario.setCpf(12343);
		respositorioUsuario.salvarUsuario(usuario);
		
	}

}
