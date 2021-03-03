package librarypproject;


public class Book {
	private String ISBN_10;
	private String Author;
	private String Title;
	private String Signature;

	public Book(String isbn)
	{
	if((isbn.length()==10))
	{
	for(int i=0;i<isbn.length();i++)
	{
	char x=isbn.charAt(i);
	if(!Character.isDigit(x)){
	System.out.println("the ISBN not valid");
	break;}
	}
	this.ISBN_10=isbn;
	}
	else 
	System.out.println("the ISBN not valid");
	}


	public  String getISBN()
	{
	return ISBN_10;
	}
	
	public  String getAuthor()
	{
	return Author;
	}
	
	public  String getTitle()
	{
	return Title;
	}
	
	public  String getSignature()
	{
	return Signature;
	}
	
	public  void setAuthor(String a)
	{
	this.Author=a;
	}
	
	public  void setTitle(String a)
	{
	this.Title=a;
	}
	
	public  void setSignature(String a)
	{
	this.Signature=a;
	}
}
