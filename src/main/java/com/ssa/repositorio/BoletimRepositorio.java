package com.ssa.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.DiarioBoletim;

public class BoletimRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	
	public BoletimRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SystemSSA");
		em = emf.createEntityManager();
		
	}
	
	public DiarioBoletim obterPorId(int id) {
		em.getTransaction().begin();
		DiarioBoletim boletim = em.find(DiarioBoletim.class, id);
		em.getTransaction().commit();
		emf.close();
		return boletim;
	}
	
	public void salvarBoletimDiario(DiarioBoletim u) {
		em.getTransaction().begin();
		DiarioBoletim usuario = new DiarioBoletim();        
		em.merge(u);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removerUsuario(DiarioBoletim u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();
	}
	@SuppressWarnings("uncheked")
	public List<DiarioBoletim> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from DiarioBoletim id");
		List<DiarioBoletim> usuarios = consulta.getResultList();
		em.getTransaction().commit();
		em.close();
		
	return usuarios;
	}
	
}
