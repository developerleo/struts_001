package cn.luecc;

//import javax.transaction.Transaction;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import cn.luecc.vo.User;
import org.hibernate.Transaction;

public class Base {

	public static void main(String[] args)
	{
		/*Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();*/
		
		Session s;
		s = HibernateUtil.getSession();
		User user = new User();
		
		Transaction ts = s.beginTransaction();
		
		user.setEmailadd("1@qq.com");
		user.setPassword("12345df6Abc");
		user.setUsername("123fddff");
		
		s.save(user);
		ts.commit();
		s.close();
		System.out.println("hibernate test done");
		
	}

}
