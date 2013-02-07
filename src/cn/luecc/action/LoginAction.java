package cn.luecc.action;
import com.opensymphony.xwork2.ActionSupport;  
import cn.luecc.vo.User;

public class LoginAction extends ActionSupport{
	private User user = null;
/*	public LoginAction()
	{
		System.out.println("LoginAction constructor is called ");
	}*/
    //getter and setter ...  
    public User getUser() {
        return user; 
    }  
    public void setUser(User user) {  
        this.user = user;
    }  
    @Override  
    public String execute() throws Exception { 
    	System.out.print("execute in LoginAction is called");
        //注意这里使用get来取得属性值   
    	if(user.getUsername().equals("aaa")&&user.getPassword().equals("aaa")) {  
                return SUCCESS;  
            }else {  
                return ERROR;  
        }  
    } 
}
