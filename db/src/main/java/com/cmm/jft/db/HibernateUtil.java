package com.cmm.jft.db;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author imssbora
 */
public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static List<Class> mappedClasses = new ArrayList<Class>();

	public static SessionFactory getSessionFactory(String fileName) {
		if (sessionFactory == null) {
			try {
				// Create registry
				registry = new StandardServiceRegistryBuilder()
						.configure(fileName)
						.build();

				// Create MetadataSources
				//MetadataSources sources = new MetadataSources(registry);
				
				//mappedClasses.forEach(c -> sources.addAnnotatedClass(c));
				
				// Create Metadata
				//Metadata metadata = sources.getMetadataBuilder().build();
				
				// Create SessionFactory
				//sessionFactory = metadata.getSessionFactoryBuilder().build();

			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}