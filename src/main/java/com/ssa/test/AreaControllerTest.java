package com.ssa.test;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ssa.model.Area;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AreaControllerTest{
	
	private static EntityManagerFactory emf;
    private static Logger logger = Logger.getGlobal();
    private EntityManager em;
    private EntityTransaction et;
	
	 @BeforeClass
	    public static void setUpClass() {
	        //logger.setLevel(Level.INFO);
	        logger.setLevel(Level.SEVERE);
	        emf = Persistence.createEntityManagerFactory("SSASystem");
	        DBUnitTest.inserirDados();
	    }

	    @AfterClass
	    public static void tearDownClass() {
	        emf.close();
	    }

	    @Before
	    public void setUp() {
	        em = emf.createEntityManager();
	        beginTransaction();
	    }

	    @After
	    public void tearDown() {
	        commitTransaction();
	        em.close();
	    }

	    private void beginTransaction() {
	        et = em.getTransaction();
	        et.begin();
	    }

	    private void commitTransaction() {
	        try {
	            et.commit();
	        } catch (Exception ex) {
	            logger.log(Level.SEVERE, ex.getMessage(), ex);
	            et.rollback();
	            fail(ex.getMessage());
	        }
	    }
	

	@Test
	public void listaAreaJPQL() {

		String consultaSql = "SELECT c FROM Area c";
		TypedQuery<Area> consultaArea = em.createQuery(consultaSql, Area.class);
		
		List<Area> areas = consultaArea.getResultList();
		
		for(Area area:areas){
			
			System.out.println(area.getNomeArea());
		}

	}/*
	
	@Test
	public void pegarAreaSQL(){
		
		Query sql = em.createNativeQuery("SELECT nomeArea FROM tb_area WHERE idArea = :id");
		String nome = (String) sql.getSingleResult();
		
	}
	
	@Test
	public void deletarAreaSQL(Long id){
		
		Query deleteSql = em.createNativeQuery("DELETE FROM Area a WHERE a.idArea = :id");
		deleteSql.executeUpdate();
		
	}
	*/

	/*@Test
	public void salvarArea(Area a) {
		
		em.getTransaction().begin();
		Area are = new Area();        
		em.merge(a);
		em.getTransaction().commit();

	}*/
	


}
