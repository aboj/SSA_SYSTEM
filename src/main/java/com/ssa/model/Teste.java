package com.ssa.model;

import java.util.List;
import java.util.Scanner;

import com.ssa.controller.BoletimController;
import com.ssa.controller.LiraRatoController;
import com.ssa.controller.TipoUsuarioController;
import com.ssa.controller.UsuarioController;
import com.ssa.model.LiraRato;
import com.ssa.model.TipoUsuario;
import com.ssa.model.Usuario;
import com.ssa.model.DiarioBoletim.Motivo;
import com.ssa.model.DiarioBoletim.Situacao;
import com.ssa.model.DiarioBoletim.TipoImovel;



public class Teste {

	public static void main(String[] args) {
		
		/*
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		Usuario usuario = new Usuario();
		
		usuario.setNome("Isaaaaabela Chiara");
		usuario.setCpf(21223231);
		usuario.setMatricula(1232);
		usuario.setLogin("isa");
		usuario.setSenha("isasninhaehnois");

		
		TipoUsuarioRepositorio tipusuariorepositorio = new TipoUsuarioRepositorio();
		TipoUsuario tipousuario = new TipoUsuario();
		tipousuario.setId(1);
		tipusuariorepositorio.salvarTipoUsuario(tipousuario);
		usuario.setTipoUsuario(tipousuario);
		repositorio.salvarUsuario(usuario);
		*/
	    
		SalvarBoletim();
		SalvarLiraRato();

		/*
		UsuarioRepositorio teste = new UsuarioRepositorio();
		Usuario nomeusuuario = teste.obterPorId(13);
		nomeusuuario.setCpf(121234);
		repositorio.salvarUsuario(nomeusuuario);
		
		
		UsuarioRepositorio respositorioUsuario = new UsuarioRepositorio();
		List<Usuario> usuarios = respositorioUsuario.listarTodos();
		for(Usuario usuarionomes : usuarios) {
		System.out.println(usuario.getNome());	
		}
		
		
		BoletimRepositorio boletim = new BoletimRepositorio();
		BoletimRepositorio testeboletim = new BoletimRepositorio();
		DiarioBoletim boletimdiario = testeboletim.obterPorId(2);
		System.out.println(boletimdiario.getMotivo());
		
		*/
		
	}
	public static void DeletarUsuario(){
		UsuarioController repositorioUsuario = new UsuarioController(); BoletimController repositorioboletim = new BoletimController();
				Scanner entrada = new Scanner(System.in);
				System.out.printf("Digite o ID:");
				int aux = entrada.nextInt();
				repositorioUsuario.removerUsuario(aux);
			}
	public static void SalvarBoletim(){		
		UsuarioController repositorioUsuario = new UsuarioController(); BoletimController repositorioboletim = new BoletimController();
				Scanner entrada = new Scanner(System.in);
				DiarioBoletim boletim = new DiarioBoletim();
				System.out.println("Criando Boletim Diario:");
				
					System.out.printf("Ciclo:");
					boletim.setCiclo(entrada.nextInt());
					System.out.printf("Motivo:");
					boletim.setMotivo(Motivo.Fechado);
					System.out.printf("Numero da planilha:");
					boletim.setNumero_planilha(entrada.nextInt());
					System.out.printf("Periodo:");
					boletim.setPeriodo(entrada.nextInt());
					System.out.printf("Quarteirão concluido:");
					boletim.setQuarteirao_concluido(false);
					System.out.printf("Situaçao:");
					boletim.setTipoImovel(TipoImovel.Industria);
					System.out.printf("TipoImovel");
					boletim.setSituacao(Situacao.Inspecionado);
					repositorioboletim.salvarBoletimDiario(boletim);			
			}
	public static void SalvarLiraRato(){		
		LiraRatoController liraRatoRepositorio = new LiraRatoController(); 
				LiraRato lirarato = new LiraRato();
				System.out.println("Criando Boletim Diario:");
				
					lirarato.setAlimento_exposto(true);
					lirarato.setArea_alagavel(false);
					lirarato.setDrenagem_inadequada(false);
					lirarato.setEsgostamento_inadequado(true);
					lirarato.setTipoImovel(com.ssa.model.LiraRato.TipoImovel.Comercio);
					liraRatoRepositorio.salvarLiraRato(lirarato);			
			}

}
