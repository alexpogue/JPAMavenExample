package com.javawebtutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {
	private static EntityManager em;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DogPU");
		em = emf.createEntityManager();

		createDog(1, "Spot", "Welsh Corgi");
		createDog(2, "Fluffy", "Poodle");
		createDog(3, "Clifford", "Golden Retriever");

	}

	private static void createDog(int id, String name, String breed) {
		em.getTransaction().begin();
		Dog emp = new Dog(id, name, breed);
		em.persist(emp);
		em.getTransaction().commit();
	}
}