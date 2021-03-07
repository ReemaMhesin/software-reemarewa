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
	 
	 public String sa ;
	 public String si ;
	 public String st ;
	 public String ss ;
	 public boolean flagsearch = false ;
	 public boolean flage = false ;
	 public boolean flage2 = false ;
	 String message="ISBN"+"     |     "+"Title"+"     |     "+"Author"+"     |     "+"Signature"+"\n";
	 
	 public void admin() {
		 String name ="rewaa";
		 String pass ="1111";
		 User rere = new User(name,pass);
		 userpassword.add(rere);
	 }
	 
	 public void bookbook() {
		 String a ="reema mhesin";
		 String s ="bookmi";
		 String i ="1234567890";
		 String t ="medicine for student";
		 Book x = new Book(i,a,t,s);
		 library.add(x);
		 String aaa ="rewaa shehada";
		 String sss ="book2020";
		 String iii ="1234569999";
		 String ttt ="med for doctors";
		 Book xx = new Book(iii,aaa,ttt,sss);
		 library.add(xx);
		 String o ="reema fadi";
		 String p ="book0000";
		 String l ="1223456789";
		 String k ="medicine";
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
			else {JOptionPane.showMessageDialog(null,"obs failed login" );}
				
		}
		else {JOptionPane.showMessageDialog(null,"failed login" );}
	}
	}



	public  void adminaddbook(String a,String b,String c,String d,String e,String f)
	{
		for( int i=0;i<userpassword.size();i++){
			String nn=(userpassword.get(i)).getname();
		if(nn.equalsIgnoreCase(a)) {
				String pp=(userpassword.get(i)).getpassword();
			if(pp.equalsIgnoreCase(b)) {
				
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
				
			}
				
				
			
			}
			else {JOptionPane.showMessageDialog(null,"you are not the admin,you can't add books" );}
				
		}
		else {JOptionPane.showMessageDialog(null,"you are not the admin,you can't add books" );}
	}
	}
	
	
	
		
		
		
		public boolean testadd()
		{
			return canadd;
		}

	

	public void logout() {
		JOptionPane.showMessageDialog(null,"successful logout" );
		flagadmin = false;
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
		String  str;
		
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
				str=si+" | "+st+" | "+sa+" | "+ss+"\n";
				JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
				
			}
			flage=false;
			}//for
			if(flage2==false) {
				JOptionPane.showMessageDialog(null,"This library doesnt have this book");
		}
	}
	
	
	
	public void searchtitle(String t) {
		String  str;
		
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
			
			str=si+" | "+st+" | "+sa+" | "+ss+"\n";
			JOptionPane.showMessageDialog(null,message+"\n"+str+"\n" );
			}
			flage=false;
			}//for	
			if(flage2==false) {
					JOptionPane.showMessageDialog(null,"This library doesnt have this book");
			}
	}
	
	public void searchisbn(String v) {
		int flage=1;
		String  str;
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


	
}

