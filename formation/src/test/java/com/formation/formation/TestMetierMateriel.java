package com.formation.formation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.formation.entities.Materiel;
import com.formation.formation.metier.InterMetierMateriel;

public class TestMetierMateriel {
	
	private static ClassPathXmlApplicationContext context;
	private static InterMetierMateriel metierMateriel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metierMateriel = (InterMetierMateriel) context.getBean("metierMateriel");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*@Test
	public void testAddMateriel() {
		Materiel m=new Materiel("ordi", "bon");
		metierMateriel.addMateriel(m);
		assertNotNull(m.getIdMateriel());
	}*/

	@Test
	public void testGetListMateriel() {
		assertTrue(metierMateriel.getListMateriel().size()>0);
	}

	@Test
	public void testUpdateMateriel() {
		Materiel m=metierMateriel.getMateriel(1L);
		m.setNomMateriel("test");
		metierMateriel.updateMateriel(m);
		assertEquals(metierMateriel.getMateriel(1L).getNomMateriel(),"test");
	}

	/*@Test
	public void testDeleteMateriel() {
		List<Materiel> tab1=metierMateriel.getListMateriel();
		metierMateriel.deleteMateriel(1L);
		List<Materiel> tab2=metierMateriel.getListMateriel();
		assertTrue(tab2.size()+1==tab1.size());
	}*/

	@Test
	public void testGetMateriel() {
		assertEquals(metierMateriel.getMateriel(1L).getEtatMateriel(), "bon");
	}
}
