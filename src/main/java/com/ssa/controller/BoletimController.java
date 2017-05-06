package com.ssa.controller;

import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ssa.model.DiarioBoletim;

public class BoletimController {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;
	
	public BoletimController() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public DiarioBoletim obterPorId(int id) {
	try {
		em.getTransaction().begin();
		DiarioBoletim boletim = em.find(DiarioBoletim.class, id);
		em.getTransaction().commit();
		return boletim;

	}finally{
		if(preparedStatement != null) {
			emf.close();
		}
		if(preparedStatement != null) {
			em.getTransaction().begin();
		}
	}
	}
	
	public void salvarBoletimDiario(DiarioBoletim b) {
		try {
		em.getTransaction().begin();
		DiarioBoletim usuario = new DiarioBoletim();        
		em.merge(b);
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
	public void removerBoletim(int id) {
		try {
		em.getTransaction().begin();
		DiarioBoletim boletim = em.find(DiarioBoletim.class, id);
		em.remove(boletim);
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
	public List<DiarioBoletim> listarTodos(){
		try {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from DiarioBoletim id");
		List<DiarioBoletim> boletins = consulta.getResultList();
		em.getTransaction().commit();
		return boletins;

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
