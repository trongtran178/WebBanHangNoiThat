package com.noithatchatluong.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
					.build();

			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

			return metadata.getSessionFactoryBuilder().build();
		} catch (Throwable ex) {
			System.out.println("Lỗi : " + ex.getMessage());
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Giáº£i phÃ³ng cache vÃ  Connection Pools.
		getSessionFactory().close();
	}
}
