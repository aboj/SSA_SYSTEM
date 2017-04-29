package com.ssa.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AreaControllerTest {
	
	@PersistenceContext
	EntityManager em;
/*
	@Test
	public void listaAreaJPQL() {
		
		String consultaSql = "SELECT c FROM Area c";
		TypedQuery<Area> consultaArea = em.createQuery(consultaSql, Area.class);
		
		List<Area> areas = consultaArea.getResultList();
		
		for(Area area:areas){
			
			System.out.println(area.getNomeArea());
		}

	}
	
	@Test
	public void pegarAreaSQL(Long id){
		
		Query sql = em.createNativeQuery("SELECT nomeArea FROM tb_area WHERE idArea = :id");
		String nome = (String) sql.getSingleResult();
		
	}*/
	
	@Test
	public void deletarAreaSQL(Long id){
		
		Query deleteSql = em.createNativeQuery("DELETE FROM Area a WHERE a.idArea = :id");
		deleteSql.executeUpdate();
		
	}

}
