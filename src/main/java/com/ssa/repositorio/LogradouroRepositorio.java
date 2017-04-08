package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.Logradouro;

public class LogradouroRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public LogradouroRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Logradouro obterPorId(int id) {
		try {
		em.getTransaction().begin();
		Logradouro logradouro = em.find(Logradouro.class, id);
		em.getTransaction().commit();
		return logradouro;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarlogradouro(Logradouro u) {
		try {
		em.getTransaction().begin();
		Logradouro tipousuario = new Logradouro();        
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
	public void removerLogradouro(int id) {
		try {
		em.getTransaction().begin();
		Logradouro tipousuario = em.find(Logradouro.class, id);
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
	@SuppressWarnings("uncheked")
	public List<Logradouro> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Logradouro id");
		List<Logradouro> tipousuarios = consulta.getResultList();
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
