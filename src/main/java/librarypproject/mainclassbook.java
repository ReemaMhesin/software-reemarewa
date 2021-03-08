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
	 public boolean flagadmin = false ;
	 public boolean flagaddbook = false ;
	 public boolean canadd =false;
	 public boolean logout =false;
	 
	 public String sa ;
	 public String si ;
	 public String st ;
	 public String ss ;
	 public boolean flagsearch = false ;
	 public boolean flage = false ;
	 public boolean flage2 = false ;
	 String message="ISBN"+"     |     "+"Title"+"    |     "+"Author"+"     |     "+"Signature"+"\n";
	 
	 public void admin() {
		 String name ="rewaa";
		 String pass ="1111";
		 User rere = new User(name,pass);
		 userpassword.add(rere);
	 }
	 
	 public void bookbook() {
		 String a ="Brian Alexander";
		 String s ="Historybook";
		 String i ="1250237351";
		 String t ="The Hospital";
		 Book x = new Book(i,a,t,s);
		 library.add(x);
		 String aaa ="Walter Wick";
		 String sss ="Photograghybook";
		 String iii ="0439165873";
		 String ttt ="A Ray of Light";
		 Book xx = new Book(iii,aaa,ttt,sss);
		 library.add(xx);
		 String o ="Walter Wick";
		 String p ="book2020";
		 String l ="0590221973";
		 String k ="A Drop Of Water";
		 Book m = new Book(l,o,k,p);
		 library.add(m);
		 
		 
		 }
	 
	 
	 
	 
	public  void main_login_userpassword(String a,String b)
	{
		for( int i=0;i<userpassword.size();i++){
			String nn=(userpassword.get(i)).getname();
		if(nn.equalsIgnoreCase(a)) {
				String pp=(userpassword.get(i)).getpassword();
			if(pp.equalsIgnoreCase(b)) {
				JOptionPane.showMessageDialog(null,"successful login" );
				flagadmin = true;
			}
			else {JOptionPane.showMessageDialog(null," failed login" );}
				
		}
		else {JOptionPane.showMessageDialog(null,"failed login" );}
	}
	}


	
	
	public  void makeadminlogin ()
	{
		
				flagadmin = true;
			
	
	}

	


	public  void adminaddbook(String c,String d,String e,String f)
	{
			if(flagadmin==true) {
				
				int sum=0;
				int mood;
			
			if((c.length()==10))
			{
			for(int j=0;j<c.length();j++)
			{
				
			char x=c.charAt(j);
			sum+=(j+1)*x;
			}
			mood=sum%11;
			
			if(mood==0){

				canadd= true;
				Book x = new Book(c,e,d,f);
				library.add(x);
				
				JOptionPane.showMessageDialog(null,"The book added" );
				
				
				
				
			}
			if(mood!=0)
				JOptionPane.showMessageDialog(null,"The ISBN not valid" );
			    canadd= true;
		
				
			}	
			
			}
			else {JOptionPane.showMessageDialog(null,"you are not the admin,you can't add books" );}
				
		
		
	}
	
	
	
	
		
		
		
		public boolean testadd()
		{
			return canadd;
		}

	

	public boolean logout() {
		if(flagadmin==true) {
		JOptionPane.showMessageDialog(null,"successful logout" );
		flagadmin = false;
		logout = true;
		return logout;
	}
		else {logout = false;JOptionPane.showMessageDialog(null,"You are not logged in" );
		return logout;}
	}
	public boolean testflagadmin ()
	{
	return flagadmin;
}
	public boolean testflagaddbook() {
		
		return flagaddbook;
	}
	
	public boolean testflagsearch ()
	{
	return flagsearch;
}
	
	
	public void searchauther(String a) {
		 String  str="";
		
		for( int i=0;i<library.size();i++){
			String test=(library.get(i)).getAuthor();
			String[]f=test.split(" ");
		     
			for(String string:f){
			if(string.equalsIgnoreCase(a)) {
			flage=true;
			flage2=true;
			break;
			}
			}
			if(flage==true) {
				sa=library.get(i).getAuthor();
				si=library.get(i).getISBN();
				ss=library.get(i).getSignature();
				st=library.get(i).getTitle();
				flagsearch=true;
				str+=si+" | "+st+" | "+sa+" | "+ss+"\n";
				
				
			}
			flage=false;
			}//for
		
		if(flage2==true) {
			JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
	}
		
		else if(flage2==false) {
				JOptionPane.showMessageDialog(null,"This library doesnt have this book");
		}
	}
	
	
	
	public void searchtitle(String t) {
		String  str="";
		
			for( int i=0;i<library.size();i++){
			String test=(library.get(i)).getTitle();
			String[]f=test.split(" ");
		     
			for(String string:f){
			if(string.equalsIgnoreCase(t)) {
				flage=true;
				flage2=true;
				break;
			}
			}
			
			if(flage==true) {
		    sa=library.get(i).getAuthor();
			si=library.get(i).getISBN();
			ss=library.get(i).getSignature();
			st=library.get(i).getTitle();
			flagsearch=true;
			
			str+=si+" | "+st+" | "+sa+" | "+ss+"\n";
			
			}
			flage=false;
			}//for	
			if(flage2==true) {
				JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
		}
			
			else if(flage2==false) {
					JOptionPane.showMessageDialog(null,"This library doesnt have this book");
			}
	}
	
	public void searchisbn(String v) {
		int flagee=0;
		String  str="";
		char c;
		char z;
			for( int i=0;i<library.size();i++){
			String test=(library.get(i)).getISBN();
			char []array1 =v.toCharArray();
			char []array2 =test.toCharArray();
			for(int k=0;k<(array1.length);k++)
			{
			 c=array1[k];
			 z=array2[k];	
			if(c==z){
			flagee=1;
			}
			else {
			flagee=0;
			}
			}//for
			if(flagee==1) {
			flage2=true;	
		    sa=library.get(i).getAuthor();
			si=library.get(i).getISBN();
			ss=library.get(i).getSignature();
			st=library.get(i).getTitle();
			flagsearch=true;
			str=si+" | "+st+" | "+sa+" | "+ss+"\n";
			
			}
			flagee=0;
			}
			//for
			if(flage2==true) {
				JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
		}
			
			else if(flage2==false) {
					JOptionPane.showMessageDialog(null,"This library doesnt have this book");
			}
			flagee=0;
	}

	public void adminsearch(String str2,String str1)
	{
		
		if(flagadmin==true)
		{
		
			if(str1.equalsIgnoreCase("isbn"))
			{
		    int flage=1;
			String  str;
			char c;
			char z;
				for( int i=0;i<library.size();i++){
				String test=(library.get(i)).getISBN();
				char []array1 =str2.toCharArray();
				char []array2 =test.toCharArray();
				for(int k=0;k<(array1.length);k++)
				{
				 c=array1[k];
				 z=array2[k];	
				if(c==z){
				flage=1;
				}
				else {
				flage=0;
				}
				}//for
				if(flage==1) {
				flage2=true;	
			    sa=library.get(i).getAuthor();
				si=library.get(i).getISBN();
				ss=library.get(i).getSignature();
				st=library.get(i).getTitle();
				flagsearch=true;
				str=si+" | "+st+" | "+sa+" | "+ss+"\n";
				JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
				}
				}//for
				if(flage2==false) {
					JOptionPane.showMessageDialog(null,"This library doesnt have this book");
			}
		
			}
			else if(str1.equalsIgnoreCase("title"))
			{
				String  str;
				
				for( int i=0;i<library.size();i++){
				String test=(library.get(i)).getTitle();
				String[]f=test.split(" ");
			     
				for(String string:f){
				if(string.equalsIgnoreCase(str2)) {
					flage=true;
					flage2=true;
					break;
				}
				}
				
				if(flage==true) {
			    sa=library.get(i).getAuthor();
				si=library.get(i).getISBN();
				ss=library.get(i).getSignature();
				st=library.get(i).getTitle();
				flagsearch=true;
				
				str=si+" | "+st+" | "+sa+" | "+ss+"\n";
				JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
				}
				flage=false;
				}//for	
				if(flage2==false) {
						JOptionPane.showMessageDialog(null,"This library doesnt have this book");
				}
}
			 else if(str1.equalsIgnoreCase("author"))
			 {
				 String  str="";
					
					for( int i=0;i<library.size();i++){
						String test=(library.get(i)).getAuthor();
						String[]f=test.split(" ");
					     
						for(String string:f){
						if(string.equalsIgnoreCase(str2)) {
						flage=true;
						flage2=true;
						break;
						}
						}
						if(flage==true) {
							sa=library.get(i).getAuthor();
							si=library.get(i).getISBN();
							ss=library.get(i).getSignature();
							st=library.get(i).getTitle();
							flagsearch=true;
							str+=si+" | "+st+" | "+sa+" | "+ss+"\n";
						}
						flage=false;
						}//for
					
					if(flage2==true) {
						JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
				}
					
					else if(flage2==false) {
							JOptionPane.showMessageDialog(null,"This library doesnt have this book");
					}
					}
			
		}
		
		
	}
	}

	


