package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empo>
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=3;i++) {
			
			System.out.println("Employee "+i+" data:");
			System.out.print("Outsourced? (y/n) ");
			char answer=sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Hours: ");
			Integer hours=sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour=sc.nextDouble();
			
			if (answer=='s') {
				
			}
				
			}
			
			
			
			
			
			
			
			
			
		}
		

}
