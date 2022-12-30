package zadania;

import java.util.Scanner;

public class Największa {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Podaj pierwszą liczbę");
		
		int a = sc.nextInt();
		
		System.out.println("Podaj drugą liczbę");
		
		int b = sc.nextInt();
		
		System.out.println("Podaj trzecią liczbę");
		
		int c = sc.nextInt();
		
		if (a>b & a>c) { System.out.println("największe jest " + a);}
		if(b>a & b>c) {System.out.println(b);}
		if(c>a & c>b) {System.out.println(c);}
		

	}

}
