package com.ssa.test;

import static org.junit.Assert.assertEquals;
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

import com.ssa.model.Quarteirao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuarteiraoControllerTest {
	
	private static EntityManagerFactory emf;
    private static Logger logger = Logger.getGlobal();
    private EntityManager em;
    private EntityTransaction et;
	
	 @BeforeClass
	    public static void setUpClass() {
	       	logger.setLevel(Level.INFO);
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
	public void listaQuarteiraoJPQL() {
		logger.info("Executando t04: SELECT c FROM Quarteirao c");
		String consultaSql = "SELECT c FROM Quarteirao c";
		TypedQuery<Quarteirao> consultaQuarteirao = em.createQuery(consultaSql, Quarteirao.class);
		
		List<Quarteirao> quarteiroes = consultaQuarteirao.getResultList();
		
		/*for(Quarteirao quarteirao:quarteiroes){
			
			System.out.println(quarteirao.getDescricaoQuarteirao());
		}*/
		
		assertEquals(3, quarteiroes.size());

	}
	
	/*@Test
	public void pegarAreaSQL(){
		int i = 1;
		Query sql = em.createNativeQuery("SELECT nomeArea FROM tb_area WHERE idArea = :i");
		String nome = (String) sql.getSingleResult();
		
	}*/

}
