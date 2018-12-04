import java.util.Scanner;

public class Bankkonto {

	public static void main(String[] args) {
		
		Konto aKonto = new Konto ();
		Scanner scan = new Scanner(System.in);
		int choice;
		char go = 'n'; 
		
		while(go == 'n') {
		
			System.out.println("Insättning eller uttag (0-insättning, 1-uttag): ");
			choice = scan.nextInt();
		
			if(choice == 0) {
			
				System.out.println("Ange belopp: ");
				aKonto.credit(scan.nextDouble());
		
				System.out.println("Saldo: ");
			
			} else if(choice == 1) {
			
				System.out.println("Ange belopp: ");
				aKonto.withdraw(scan.nextDouble());
			
				System.out.println("Saldo: ");
			
			
			}
		
			System.out.println(aKonto.getBalance());
		
			System.out.print("Vill du avsuta? ");
			go = scan.next().charAt(0);
		 
		}
	
		System.out.println(aKonto.getBalance());
		scan.close();
	}
	
	

}
