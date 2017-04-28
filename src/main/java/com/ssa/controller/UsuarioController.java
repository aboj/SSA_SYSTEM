package com.ssa.controller;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ssa.model.Usuario;

public class UsuarioController {

	EntityManagerFactory emf;
	EntityManager em;

	
	public UsuarioController() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Usuario obterPorId(int id) {
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, id);
		em.getTransaction().commit();
		return usuario;
	}
	
	public void salvarUsuario(Usuario u) {
		
		em.getTransaction().begin();
		Usuario usuario = new Usuario();        
		em.merge(u);
		em.getTransaction().commit();
		emf.close();
	}	
			
		
	public void removerUsuario(int id) {
	
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, id);
		em.remove(usuario);
		em.getTransaction().commit();
		emf.close();
			
	}
	public List<Usuario> listarTodos(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Usuario id");
		List<Usuario> usuarios = consulta.getResultList();
		em.getTransaction().commit();
		return usuarios;

	}
		
		
	}
	

