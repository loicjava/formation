package com.formation.formation;



import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;










import com.formation.formation.entities.Sessions;

import com.formation.formation.metier.InterMetierSessions;

public class testsessions {
	private static ClassPathXmlApplicationContext context;
	private static InterMetierSessions metierSessions;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("app.xml");
		metierSessions = (InterMetierSessions) context.getBean("metierSessions");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*@Test
	public void testAddSession() {
		
		Sessions s=new Sessions("nomSession", new Date(), new Date());
		metierSessions.addSession(s, 1L);
		List<Sessions> list=metierSessions.getListSession();
		assertTrue(list.size()>0);
	}*/

	@Test
	public void testUpdateSession() {
		Sessions s=metierSessions.getSession(1L);
		s.setNomSession("nomSession2");
		metierSessions.updateSession(s);
		assertTrue(metierSessions.getSession(1L).getNomSession().contains("nomSession2"));
	}

	@Test
	public void testGetSession() {
		Sessions s=metierSessions.getSession(1L);
		assertTrue(s!=null);
	}

	@Test
	public void testGetListSession() {
		List<Sessions> list=metierSessions.getListSession();
		assertTrue(list.size()>0);
	}

	/*@Test
	public void testDeleteSession() {
		
	}*/

	@Test
	public void testAddModuletoSession() {
		metierSessions.addModuletoSession(1L, 1L);
		Sessions s=metierSessions.getSession(1L);
		assertTrue(s.getListmodule().size()>0);
	}

}
