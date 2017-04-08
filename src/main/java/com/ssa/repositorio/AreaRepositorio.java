package com.ssa.repositorio;

import java.sql.PreparedStatement;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ssa.Area;

public class AreaRepositorio {

	EntityManagerFactory emf;
	EntityManager em;
	PreparedStatement preparedStatement = null;

	
	public AreaRepositorio() {
		
		emf = Persistence.createEntityManagerFactory("SSASystem");
		em = emf.createEntityManager();
		
	}
	
	public Area obterPorId(int id) {
		try {
		em.getTransaction().begin();
		Area area = em.find(Area.class, id);
		em.getTransaction().commit();
		return area;

		}finally{
			if(preparedStatement != null) {
				emf.close();
			}
			if(preparedStatement != null) {
				em.getTransaction().begin();
			}
		}
	}
	
	public void salvarArea(Area a) {
		try {
		em.getTransaction().begin();
		Area are = new Area();        
		em.merge(a);
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
	public void removerArea(int id) {
		try {
		em.getTransaction().begin();
		Area lirarato = em.find(Area.class, id);
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
	public List<Area> listarTodos(){
		try{
		em.getTransaction().begin();
		Query consulta = em.createQuery("select id from Area id");
		List<Area> areas = consulta.getResultList();
		em.getTransaction().commit();
		return areas;

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
