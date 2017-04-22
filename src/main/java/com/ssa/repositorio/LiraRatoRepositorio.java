package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.LiraRato;

public class LiraRatoRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public LiraRatoRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public LiraRato obterPorId(int id) {
		try {
		em.getTransaction().begin();
		LiraRato lirarato = em.find(LiraRato.class, id);
		em.getTransaction().commit();
		return lirarato;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarLiraRato(LiraRato u) {
		em.getTransaction().begin();
		LiraRato lirarato = new LiraRato();        
		em.merge(u);
		em.getTransaction().commit();
		emf.close();
		
		
	}
	public void removerLiraRato(int id) {
		try {
		em.getTransaction().begin();
		LiraRato lirarato = em.find(LiraRato.class, id);
		em.remove(lirarato);
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
	public List<LiraRato> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Quarteirao id");
		List<LiraRato> lirasrato = consulta.getResultList();
		em.getTransaction().commit();
		return lirasrato;

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
