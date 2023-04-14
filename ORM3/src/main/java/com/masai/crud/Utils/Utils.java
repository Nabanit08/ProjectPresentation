package com.masai.crud.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utils {
	private static EntityManagerFactory emf;
static {
	emf=Persistence.createEntityManagerFactory("employee");
}
public static EntityManager getEntityManager() {
	return emf.createEntityManager();
}
}
