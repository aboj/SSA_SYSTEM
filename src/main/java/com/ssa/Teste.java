package com.ssa;

import java.util.List;
import java.util.Scanner;

import com.ssa.DiarioBoletim.Motivo;
import com.ssa.DiarioBoletim.Situacao;
import com.ssa.DiarioBoletim.TipoImovel;
import com.ssa.TipoUsuario;
import com.ssa.Usuario;
import com.ssa.repositorio.BoletimRepositorio;
import com.ssa.repositorio.LiraRatoRepositorio;
import com.ssa.repositorio.TipoUsuarioRepositorio;
import com.ssa.repositorio.UsuarioRepositorio;
import com.ssa.LiraRato;



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
		UsuarioRepositorio repositorioUsuario = new UsuarioRepositorio(); BoletimRepositorio repositorioboletim = new BoletimRepositorio();
				Scanner entrada = new Scanner(System.in);
				System.out.printf("Digite o ID:");
				int aux = entrada.nextInt();
				repositorioUsuario.removerUsuario(aux);
			}
	public static void SalvarBoletim(){		
		UsuarioRepositorio repositorioUsuario = new UsuarioRepositorio(); BoletimRepositorio repositorioboletim = new BoletimRepositorio();
				Scanner entrada = new Scanner(System.in);
				DiarioBoletim boletim = new DiarioBoletim();
				System.out.println("Criando Boletim Diario:");
				
					System.out.printf("Ciclo:");
					boletim.setCiclo(entrada.nextInt());
					System.out.printf("Motivo:");
					boletim.setMotivo(Motivo.Desocupado);
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
		LiraRatoRepositorio liraRatoRepositorio = new LiraRatoRepositorio(); 
				LiraRato lirarato = new LiraRato();
				System.out.println("Criando Boletim Diario:");
				
					lirarato.setAlimento_exposto(true);
					lirarato.setArea_alagavel(false);
					lirarato.setDrenagem_inadequada(false);
					lirarato.setEsgostamento_inadequado(true);
					lirarato.setTipoImovel(com.ssa.LiraRato.TipoImovel.Comercio);
					liraRatoRepositorio.salvarLiraRato(lirarato);			
			}

}
