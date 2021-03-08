package librarypproject;


public class Book {
	private String ISBN_10;
	private String Author;
	private String Title;
	private String Signature;

	public Book(String isbn,String auther,String title,String sig)
	{
	this.ISBN_10=isbn;
	this.Author=auther;
	this.Title=title;
	this.Signature=sig;
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
