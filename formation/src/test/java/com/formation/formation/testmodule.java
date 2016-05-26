package com.formation.formation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.formation.entities.Module;
import com.formation.formation.metier.InterMetierModule;

public class testmodule {
	private static ClassPathXmlApplicationContext context;
	private static InterMetierModule metierModule;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("app.xml");
		metierModule = (InterMetierModule) context.getBean("metierModule");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	
	@Test
	public void testAddModule() {
		Module m=new Module("nomModule", 10, "description");
		metierModule.addModule(m);
		assertNotNull(m.getIdModule());
	}

	@Test
	public void testUpdateModule() {
		Module m=metierModule.getModule(1L);
		m.setDureeModule(11);
		metierModule.updateModule(m);
		assertTrue(m.getDureeModule()==11);
	}

	@Test
	public void testGetModule() {
		Module m=new Module("nomModule", 10, "description");
		Module m1=new Module("nomModule", 10, "description");
		Module m2=new Module("nomModule", 10, "description");
		metierModule.addModule(m);
		metierModule.addModule(m1);
		metierModule.addModule(m2);
		Module m3=metierModule.getModule(3L);
		assertNotNull(m3);
	}

	@Test
	public void testGetListModule() {
		List<Module> liste=new ArrayList<Module>();
		Module m=new Module("nomModule", 10, "description");
		Module m1=new Module("nomModule", 10, "description");
		Module m2=new Module("nomModule", 10, "description");
		metierModule.addModule(m);
		metierModule.addModule(m1);
		metierModule.addModule(m2);
		liste=metierModule.getListModule();
		assertTrue(liste.size()>0);
	}

	@Test
	public void testDeleteModule() {
		Module m=new Module("nomModule", 10, "description");
		Module m2=new Module("nomModule", 10, "description");
		metierModule.addModule(m);
		metierModule.addModule(m2);
		metierModule.deleteModule(2L);
		assertTrue(metierModule.getModule(2L)==null);
	}

}
