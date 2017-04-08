package com.ssa;

import java.util.List;
import java.util.Scanner;

import com.ssa.TipoUsuario;
import com.ssa.Usuario;
import com.ssa.repositorio.BoletimRepositorio;
import com.ssa.repositorio.UsuarioRepositorio;


public class Teste {

	public static void main(String[] args) {
		
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		Usuario usuario = new Usuario();
		TipoUsuario tipo = new TipoUsuario();
		
		tipo.setId(1);
		
		usuario.setNome("Jaaaaaoao Santos");
		usuario.setCpf(231546555);
		usuario.setMatricula(56464);
		usuario.setLogin("Joao");
		usuario.setSenha("joaninhaehnois");
		
		
		UsuarioRepositorio respositorioUsuario = new UsuarioRepositorio();
		UsuarioRepositorio teste = new UsuarioRepositorio();
		Usuario nomeusuuario = teste.obterPorId(13);
		nomeusuuario.setCpf(121234);
		repositorio.salvarUsuario(nomeusuuario);
		
		
		/*
		List<Usuario> usuarios = respositorioUsuario.listarTodos();
		for(Usuario usuarionomes : usuarios) {
		System.out.println(usuario.getNome());	
		}
		*/
		/*
		BoletimRepositorio boletim = new BoletimRepositorio();
		BoletimRepositorio testeboletim = new BoletimRepositorio();
		DiarioBoletim boletimdiario = testeboletim.obterPorId(2);
		System.out.println(boletimdiario.getMotivo());
		*/
		
		
	}

}
