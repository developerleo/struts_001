package cn.luecc.action;

public class Show {
	public static void showTrace(String msg)
	{
	  if (msg.length() > 0) System.out.println(msg);
	  System.out.println("Trace: "); 
	  System.out.println("file " + new Throwable().getStackTrace()[0].getFileName());
	  System.out.println(" class " + new Throwable().getStackTrace()[0].getClassName());
	  System.out.println(" method " + new Throwable().getStackTrace()[0].getMethodName());
	  System.out.println(" line " + new Throwable().getStackTrace()[0].getLineNumber());
	}
}
