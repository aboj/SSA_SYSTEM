package com.ssa.testes;

import com.ssa.repositorio.BoletimRepositorio;
import com.ssa.repositorio.UsuarioRepositorio;
import java.util.List;

import com.ssa.DiarioBoletim;
import com.ssa.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Teste {

	public static void main(String[] args) {

		BoletimRepositorio boletim = new BoletimRepositorio();
		DiarioBoletim novoBoletim = new DiarioBoletim();
		
		
		novoBoletim.setCiclo(1);
		novoBoletim.setMotivo(4);
		novoBoletim.setNumero_planilha(6);
		novoBoletim.setPeriodo(2);
		novoBoletim.setQuarteirao_concluido(50);
		novoBoletim.setQuarteirao_concluido(2);
		novoBoletim.setSituacao(1);
		boletim.salvarBoletimDiario(novoBoletim);

		/*
		UsuarioRepositorio respositorioUsuario = new UsuarioRepositorio();
		UsuarioRepositorio teste = new UsuarioRepositorio();
		Usuario usuario = teste.obterPorId(13);
		System.out.println(usuario.getNome());
		*/
		
		/*
		Usuario usuario = new Usuario();
		usuario.setNome("Andre da Silva");
		usuario.setLogin("Andre");
		usuario.setSenha("1234");
		usuario.setMatricula(13410);
		usuario.setCpf(12343);
		respositorioUsuario.salvarUsuario(usuario);
		**/
		/*
		List<Usuario> usuarios = respositorioUsuario.listarTodos();
		for(Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());	
		}
		}
		*/	
	}
	
}
