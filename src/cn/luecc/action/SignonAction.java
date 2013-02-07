package cn.luecc.action;

import com.opensymphony.xwork2.ActionSupport;  
import cn.luecc.vo.User;
import cn.luecc.service.UserService;

public class SignonAction extends ActionSupport{
	private User user;
	private UserService userservice = new UserService();
	
    //getter and setter ...  
    public User getUser() {
        return user; 
    }  
    public void setUser(User user) {  
        this.user = user;
    }
    
    @Override
    public String execute() throws Exception {
		System.out.println("Username:"+ user.getUsername());
		System.out.println("Emailadd:"+ user.getEmailadd());
		System.out.println("Password:"+ user.getPassword());
		
/*    	Session s = user.session;
		Transaction ts = s.beginTransaction();
    	System.out.println("after calling HibernateUtil.getSession();");*/
		
    	try {
    		userservice.add(user);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		return ERROR;
    	}

		return SUCCESS;
        //注意这里使用get来取得属性值   
    	
/*    	if(user.getUsername().equals("sss")&&
    			user.getPassword().equals("sss")&&
    			!user.getEmailadd().equals("")) {  
                return SUCCESS;  
            }else {  
                return ERROR;  
        }  */
    } 
}
