package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.BoletimSupervisor;

public class BoletimSupervisorRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public BoletimSupervisorRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public BoletimSupervisor obterPorId(int id) {
		try {
		em.getTransaction().begin();
		BoletimSupervisor boletimS = em.find(BoletimSupervisor.class, id);
		em.getTransaction().commit();
		return boletimS;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarBoletimSupervisor(BoletimSupervisor bs) {
		try {
		em.getTransaction().begin();
		BoletimSupervisor boletimS = new BoletimSupervisor();        
		em.merge(bs);
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
	public void removerBoletimSupervisor(int id) {
		try {
		em.getTransaction().begin();
		BoletimSupervisor boletimS = em.find(BoletimSupervisor.class, id);
		em.remove(boletimS);
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
	public List<BoletimSupervisor> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from BoletimSupervisor id");
		List<BoletimSupervisor> boletinsS = consulta.getResultList();
		em.getTransaction().commit();
		return boletinsS;

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
