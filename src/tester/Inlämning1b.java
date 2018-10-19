package tester;

import java.util.Scanner;

public class Inlämning1b {

	public static void main(String[] args) {
		
		System.out.println("Inlämning 1.b  \n");
		
		Scanner scan = new Scanner(System.in);
		String namn = new String ();
		
		double timlön;
		int timmar;
		
		
		System.out.println ("Ange ditt namn: ");
		namn = scan.nextLine ();
		
		System.out.println ("Ange din timlön: ");
		timlön = scan.nextDouble();
		
		System.out.println ("Ange antalet arbetade timmar: ");
		timmar = scan.nextInt();
		
		double summa = timlön * timmar;
	
		System.out.println(summa);
		
		namn = namn.toUpperCase ();
		
		System.out.println(namn + " du tjänade " + summa + " kr förra veckan");
		
	}

}
