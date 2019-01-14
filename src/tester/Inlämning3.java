package tester;

import java.util.Scanner;

public class Inlämning3 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	int tal = 0;
	int summa = 0;
	int max = Integer.MIN_VALUE;
	
	int [] list = new int [5];
	
	System.out.println ("Ange fem tal: ");
	
	for (int i = 0; i < list.length; i ++) {
		System.out.println ("Ange tal" + (i +1) + ":");
		tal = scan.nextInt();
		list[i] = tal;
		if (tal > max) {
			max = tal;
		
		}	
	}
	
	for (int i = 0; i < 5; i ++) {
		summa +=list [i];
		
	
	}
	
	
	System.out.println ("Summan av talen är: " + summa);
	
	double medel = summa/list.length;
	
	System.out.println ("Medelvärdet är: " + medel);
	System.out.println("Maxvärdet är: " + max);
		
	scan.close();
	
	}
	
	}
	

