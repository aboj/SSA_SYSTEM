package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.Quarteirao;

public class QuarteiraoRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public QuarteiraoRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Quarteirao obterPorId(int id) {
		try {
		em.getTransaction().begin();
		Quarteirao quarteirao = em.find(Quarteirao.class, id);
		em.getTransaction().commit();
		return quarteirao;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarlogradouro(Quarteirao u) {
		try {
		em.getTransaction().begin();
		Quarteirao tipousuario = new Quarteirao();        
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
	public void removerQuarteirao(int id) {
		try {
		em.getTransaction().begin();
		Quarteirao quarteirao = em.find(Quarteirao.class, id);
		em.remove(quarteirao);
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
	public List<Quarteirao> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Quarteirao id");
		List<Quarteirao> quarteiroes = consulta.getResultList();
		em.getTransaction().commit();
		return quarteiroes;

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
