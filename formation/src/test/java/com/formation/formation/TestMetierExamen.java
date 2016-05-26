package com.formation.formation;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.formation.entities.Examen;
import com.formation.formation.metier.InterMetierExamen;

public class TestMetierExamen {
	
	private static ClassPathXmlApplicationContext context;
	
	private static InterMetierExamen metierExamen;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metierExamen = (InterMetierExamen)context.getBean("metierExamen");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		context.close();
	}

	/*@Test
	public void testAddExamen() {
		Examen ex1 = new Examen("Quiz1",new Date(),20d);
		metierExamen.addExamen(ex1, 2L);
		assertNotNull(ex1.getIdExamen()); //FONCTIONNE
	}
	
	@Test
	public void testGetListExamen() {
		List<Examen> tabExamen = metierExamen.getListExamen();
		assertNotNull(tabExamen.size()>0); //FONCTIONNE
	}
	
	@Test
	public void testUpdateExamen() {
		Examen temp = metierExamen.getExamen(2L);
		temp.setNomExamen("Test Ultime");
		metierExamen.updateExamen(temp);
		assertTrue(temp.getNomExamen().equals("Test Ultime")); //FONCTIONNE
	}
	
	@Test
	public void testDeleteExamen() {
		int ancien = metierExamen.getListExamen().size();
		metierExamen.deleteExamen(2L);
		int nouveau = metierExamen.getListExamen().size();
		assertTrue(ancien>nouveau); //FONCTIONNE
	}
	
	
	@Test
	public void testGetExamen() {
		Examen ex = metierExamen.getExamen(1L);
		assertNotNull(ex.getIdExamen()); //FONCTIONNE
		
	}*/

}
