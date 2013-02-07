package cn.luecc;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public final class HibernateUtil {
	private static SessionFactory sessionFactory;
	private HibernateUtil(){
	}
	static {
		try{
		System.out.println("HibernateUtil is loading to jvm");
    	Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("cfg.buildSessionFactory()");
		sessionFactory = cfg.buildSessionFactory();
		System.out.println("after cfg.buildSessionFactory()");
		}catch (Throwable e){
			System.err.println("Initial  SessionFactory creation failed: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static Session getSession(){
		System.out.println("static Session getSession called");
		return sessionFactory.openSession();
	}

}
