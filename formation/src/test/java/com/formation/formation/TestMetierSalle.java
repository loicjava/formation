package com.formation.formation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.formation.entities.Salle;
import com.formation.formation.metier.InterMetierSalle;

public class TestMetierSalle {
	
	private static ClassPathXmlApplicationContext context;
	
	private static InterMetierSalle metierSalle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metierSalle= (InterMetierSalle) context.getBean("metierSalle");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*@Test
	public void testAddSalle() {
		Salle s=new Salle("adresse1", "Salle 1", 20);
		metierSalle.addSalle(s);
		assertNotNull(s.getIdSalle());
	}*/

	@Test
	public void testUpdateSalle() {
		Salle s=metierSalle.getSalle(1L);
		s.setNomSalle("Salle test");
		metierSalle.updateSalle(s);
		assertEquals(metierSalle.getSalle(1L).getNomSalle(), "Salle test");
	}

	@Test
	public void testGetSalle() {
		assertEquals(metierSalle.getSalle(1L).getCapaciteSalle(), 20);
	}

	@Test
	public void testDeleteSalle() {
		List<Salle> tab1=metierSalle.getSalles();
		metierSalle.deleteSalle(1L);
		List<Salle> tab2=metierSalle.getSalles();
		assertTrue(tab2.size()+1==tab1.size());
	}

	@Test
	public void testGetSalles() {
		assertTrue(metierSalle.getSalles().size()>0);
	}

}
