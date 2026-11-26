package fundamentals;

import java.util.Scanner;

public class ClassificacaoFuncionario {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		String name;
		double salary;
		int time=4;
		double newSalary=0;
		boolean validData=false;
	
		do {
			System.out.println("Type your Name: ");
			name=input.nextLine();
			
		} while ((name==null || name.trim().isEmpty()));
		
		
		
		do {
			System.out.println("Type your salary greater than zero");
			salary=input.nextDouble();
			
		} while (salary<=0);
		
		do {
			System.out.println("Length of service:");
			time=input.nextInt();
		} while (time<=0);
			
		

			
		
		System.out.println("Name: "+name);
		

		
		
		
	
		
		 if(time >=5) {
			System.out.println("Receives a 20% increase.");
			newSalary=salary*1.2;
		}else if(time>=3) {
			System.out.println("Receives a 10% increase. ");
			newSalary=salary*1.1;
		}else if(time>0) {
			System.out.println("Receives a 5% increase: ");
			newSalary=salary*1.05;
		}
		
		if(time <0) {
			System.out.println("Length of tenure at a company should not be a negative factor");
		
		}else {
			System.out.println("Length of service with the company (in years): "+time);
			
		}
		
			
		
		
		System.out.printf("New salary: $= %.2f%n", newSalary);
		
		
		
		
		
		input.close();
}
}