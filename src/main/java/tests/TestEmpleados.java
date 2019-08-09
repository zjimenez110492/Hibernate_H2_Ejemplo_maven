package tests;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.jhonatan.hibernate.modelo.Empleado;

public class TestEmpleados {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear el gestor de persistencia
		emf=Persistence.createEntityManagerFactory("Persistencia");
		manager=emf.createEntityManager();
		
		}

}
