package com.formation.formation.soap;

import javax.xml.ws.Endpoint;

public class DriverWebService {

	public static void main(String[] args) {

		String url="http://localhost:8090/";
		Endpoint.publish(url,new ClasseSoap());
		Endpoint.publish(url,new MaterielSoap());
		System.out.println(url);
		
		//http://localhost:8090/formation/ClasseSoap?wsdl
		//http://localhost:8090/formation/MaterielSoap?wsdl

	}

}
