package librarypproject;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import java.io.PrintStream;
import java.util.Formatter;

public class mainclassbook {
	
	ArrayList <Book> library=new ArrayList <Book> (); 
	ArrayList <User> userpassword=new ArrayList <User> (); 
	
	public  void main_add_userpassword(String a,String b)
	{
		userpassword.add(new User(a,b));
	}
	
	public  void main_login_userpassword(String a,String b)
	{
		for( int i=0;i<userpassword.size();i++){
			String nn=(userpassword.get(i)).getname();
		if(nn.equalsIgnoreCase(a)) {
				String pp=(userpassword.get(i)).getpassword();
			if(pp.equalsIgnoreCase(b)) {
				JOptionPane.showMessageDialog(null,"successful login" );
			}
		}
	}
	
/*
	public  String main_getISBN()
	{
	return name;
	}
	
	public  String main_getAuthor()
	{
	return password;
	}
	
	public  void main_setTitle(String a)
	{
	this.name=a;
	}
	
	public  void main_setSignature(String a)
	{
	this.password=a;
	}
	*/
	
}
}
