package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			
			System.out.println("Employee "+i+" data:");
			System.out.print("Outsourced? (y/n) ");
			char answer=sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Hours: ");
			Integer hours=sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour=sc.nextDouble();
			
			if (answer=='y') {
				System.out.println("Additional charge: ");
				Double additionalCharge=sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
				employee.add(emp);
					
			} else 
			
			{
				Employee emp = new Employee(name,hours,valuePerHour);
				employee.add(emp);
			}
		
			}
		
		System.out.println("PAYMENTS:");
		
		for (Employee emp : employee) {
			System.out.println(emp);
		}
			
		sc.close();
		}
		
}
