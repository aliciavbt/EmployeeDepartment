package tester;

import java.util.Scanner;

public class Inlämning2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	int tal1;
	int tal2;
	
	System.out.println ("Skriv in det första talet: ");
	tal1 = scan.nextInt ();
	
	 
	while (tal1 !=0) {
		
			
				System.out.println ("Skriv in det andra talet: ");
				tal2 = scan.nextInt ();


				if (tal1 > tal2) {
					System.out.println( tal1 + " är större än " + tal2);
				} else if (tal1 < tal2) {
					System.out.println ( tal2 + " är större än " + tal1);
				} else {
					System.out.println ("Talen är lika");
				}
				
				System.out.println ("Skriv in det första talet: ");
				tal1 = scan.nextInt ();
	
			} 
		
			System.out.println ("Tackar!");
			
			
		}
	}

	
	
	