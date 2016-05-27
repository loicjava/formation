package com.formation.formation;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.metier.InterMetierEtudiant;



public class TestMetierEtudiant {
	
	private static ClassPathXmlApplicationContext context;
	
	private static InterMetierEtudiant metierEtudiant;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metierEtudiant = (InterMetierEtudiant)context.getBean("metierEtudiant");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		context.close();
	}

	@Test
	public void testAddEtudiant() {
		Etudiant et1 = new Etudiant("Blanche", "Neige", new Date(), "0111111111", "blancheneige@gmail.com", "10 rue des bois", "Java");
		Etudiant et2 = new Etudiant("Rose", "Rouge", new Date(), "0222222222", "roserouge@gmail.com", "3 rue de la forêt", "Html");
		metierEtudiant.addEtudiant(et1, 1L);
		metierEtudiant.addEtudiant(et2, 1L);
		assertNotNull(et1.getIdEtudiant());
		assertNotNull(et1.getIdEtudiant());  //FONCTIONNE
		
		
	}
	
	@Test
	public void testGetListEtudiant() {
		List<Etudiant> tabEtudiant = metierEtudiant.getListEtudiant();
		assertNotNull(tabEtudiant.size()>0); //FONCTIONNE
	}
	
	@Test
	public void testUpdateEtudiant() {
		Etudiant temp = metierEtudiant.getEtudiant(2L);
		temp.setNomEtudiant("Mont");
		metierEtudiant.updateEtudiant(temp);
		assertTrue(temp.getNomEtudiant().equals("Mont")); //FONCTIONNE
		
	}
	
	
	/*@Test
	public void testDeleteEtudiant() {
		int ancien = metierEtudiant.getListEtudiant().size();
		metierEtudiant.deleteEtudiant(1L);
		int nouveau = metierEtudiant.getListEtudiant().size();
		assertTrue(ancien>nouveau); //FONCTIONNE
		
	}*/
	
	
	@Test
	public void testAddMaterielToEtudiant() {
		
		metierEtudiant.addMaterielToEtudiant(1L, 2L); //FONCTIONNE
		
		
	}
	
	@Test
	public void testGetEtudiant() {
		
		Etudiant et = metierEtudiant.getEtudiant(1L);
		assertNotNull(et.getIdEtudiant()); //FONCTIONNE
		
	}
	

}
