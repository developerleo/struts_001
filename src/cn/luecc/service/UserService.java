package cn.luecc.service;

import cn.luecc.vo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.luecc.HibernateUtil;

public class UserService {

	public void add(User user){
		Session session = null;  
        Transaction trans = null;
        
        try  {  
            session = HibernateUtil.getSession();  
            trans = session.beginTransaction();  
            session.save(user);  
            trans.commit();  
        } catch (RuntimeException e)  {  
            //trans.rollback();  
            e.printStackTrace();  
            throw e;  
        } finally  {  
            session.close();  
        }
	}
}
