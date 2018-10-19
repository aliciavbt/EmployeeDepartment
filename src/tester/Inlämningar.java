package tester;

import java.util.Scanner;

public class Inlämningar {

	public static void main(String[] args) {
		
	System.out.println("Inlämning 1.a  \n");
	
	Scanner scan = new Scanner(System.in);
	String ord = new String ();
	
	String ord2;
	
	int ord1;

	
	
	System.out.println ("Skriv in ett ord: ");
	ord = scan.nextLine ();
	
	System.out.println ("Skriv in ytterligare ord: ");
	ord2 = scan.nextLine ();
	
	String langd = ord + " " + ord2;
	
	System.out.println(langd);
	
	System.out.println(langd.length());
	
	
	System.out.println (" \n Uppgift 1.b \n");
	
	

	}

}
