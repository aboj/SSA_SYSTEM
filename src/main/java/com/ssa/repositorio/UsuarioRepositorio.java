package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.Usuario;

public class UsuarioRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public UsuarioRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Usuario obterPorId(int id) {
		try {
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, id);
		em.getTransaction().commit();
		return usuario;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarUsuario(Usuario u) {
		try {
		em.getTransaction().begin();
		Usuario usuario = new Usuario();        
		em.merge(u);
		em.getTransaction().commit();
		} finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
		
	}
	public void removerUsuario(int id) {
		try {
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, id);
		em.remove(usuario);
		em.getTransaction().commit();
		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	public List<Usuario> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Usuario id");
		List<Usuario> usuarios = consulta.getResultList();
		em.getTransaction().commit();
		return usuarios;
		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
		
	}
	
}
