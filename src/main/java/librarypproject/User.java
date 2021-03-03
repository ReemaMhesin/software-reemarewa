package librarypproject;

public class User {
	private String name;
	private String password;
	
	public User(String n,String p) {
		this.name=n;
		this.password=p;
	}
	
	public  String getname()
	{
	return name;
	}
	
	public  String getpassword()
	{
	return password;
	}
	
	public  void setname(String a)
	{
	this.name=a;
	}
	
	public  void setpassword(String a)
	{
	this.password=a;
	}
}
