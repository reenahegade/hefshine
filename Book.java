package Abstraction;

public class Book {

	private int bprice;
	private String bname,bauthor;
	
	Book(){
		System.out.println("......Book.....");
		
	}
	
	public void setBook(int price ,String name,String author)
	{
		bprice=price;
		bname=name;
		bauthor=author;
		
	}
	
	public int getBook() {
		
		return bprice;
		
	}
	
	public String getBook1() {
		return bname;
		
		
	}
	public static void main(String args[]) {
		Book b=new Book();
		b.setBook(400, "history", "vivekanand");
		System.out.println(b.getBook());
		System.out.println(b.getBook1());
	}
	
}
