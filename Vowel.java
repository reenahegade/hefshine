package Basic;

import java.util.Scanner;

public class Vowel {
	
	public static void main(String args[]) {
		int ch;
		char a,e,i,o,u;
		
		Scanner sc=new Scanner (System .in);
		

		System.out.println("enter your choice:");
		  ch=sc.next().charAt(0);
		 
		 
		 
		    if(ch=='a'&&ch=='e'&&ch=='i'&&ch=='o'&&ch=='u') {
		    	

				System.out.println("characters are vowel...");
				
		     }
		    
		    else 
				System.out.println("characters are not vowels...");
		    
		

		
		
	}

}


