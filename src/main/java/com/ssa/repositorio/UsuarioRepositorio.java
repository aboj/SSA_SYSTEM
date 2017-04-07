package com.ssa.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.Usuario;

public class UsuarioRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	
	public UsuarioRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Usuario obterPorId(int id) {
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, id);
		em.getTransaction().commit();
		emf.close();
		return usuario;
	}
	
	public void salvarUsuario(Usuario u) {
		em.getTransaction().begin();
		Usuario usuario = new Usuario();        
		em.merge(u);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removerUsuario(Usuario u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();
	}
	@SuppressWarnings("uncheked")
	public List<Usuario> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Usuario id");
		List<Usuario> usuarios = consulta.getResultList();
		em.getTransaction().commit();
		em.close();
		
	return usuarios;
	}
	
}
