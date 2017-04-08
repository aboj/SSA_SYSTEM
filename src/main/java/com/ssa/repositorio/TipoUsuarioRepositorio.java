package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.TipoUsuario;

public class TipoUsuarioRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public TipoUsuarioRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public TipoUsuario obterPorId(int id) {
		try {
		em.getTransaction().begin();
		TipoUsuario tipousuario = em.find(TipoUsuario.class, id);
		em.getTransaction().commit();
		return tipousuario;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarTipoUsuario(TipoUsuario u) {
		try {
		em.getTransaction().begin();
		TipoUsuario tipousuario = new TipoUsuario();        
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
	public void removerTipoUsuario(int id) {
		try {
		em.getTransaction().begin();
		TipoUsuario tipousuario = em.find(TipoUsuario.class, id);
		em.remove(tipousuario);
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
	public List<TipoUsuario> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from TipoUsuario id");
		List<TipoUsuario> tipousuarios = consulta.getResultList();
		em.getTransaction().commit();
		return tipousuarios;

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
