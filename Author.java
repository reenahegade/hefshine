package Abstraction;

public class Author {

	private int authorAge;
	String aName,Apalace;
	
	Author(){
		System.out.println("....Author......");
		
	}
	
	public void setAuthor(int age,String name,String palace)
	{
		authorAge=age;
		aName=name;
		Apalace=palace;
		
	}
     
	
	public int getAuthor()
	{
		return authorAge;
		
	}
	public String getAuthor1() {
		return aName;
	
	public static void main(String args[])
	{
		Author a=new Author();
		a.setAuthor(12,"reena","nashik");
		System.out.println(a.getAuthor());
		System.out.println(a.getAuthor1());
	}
}
