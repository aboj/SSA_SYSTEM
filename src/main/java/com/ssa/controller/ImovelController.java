package com.ssa.controller;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ssa.model.Imovel;

public class ImovelController {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public ImovelController() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Imovel obterPorId(int id) {
		try {
		em.getTransaction().begin();
		Imovel imovel = em.find(Imovel.class, id);
		em.getTransaction().commit();
		return imovel;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarUsuario(Imovel i) {
		try {
		em.getTransaction().begin();
		Imovel imovel = new Imovel();        
		em.merge(i);
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
	public void removerImovel(int id) {
		try {
		em.getTransaction().begin();
		Imovel imovel = em.find(Imovel.class, id);
		em.remove(imovel);
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
	public List<Imovel> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Imovel id");
		List<Imovel> imoveis = consulta.getResultList();
		em.getTransaction().commit();
		return imoveis;

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
