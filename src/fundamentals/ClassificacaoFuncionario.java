package fundamentals;

import java.util.Scanner;

public class ClassificacaoFuncionario {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);

		String name=readName(input);
		double salary= readSalary(input);
		int time=readTime(input);	
		
		double newSalary=calculeNewSalary(salary,time);
		
		displayResults(name, time, newSalary);
		input.close();
	}
		public static String readName(Scanner input) {
			String name;
		do {
			System.out.println("Type your Name: ");
			name=input.nextLine();
			
		} while ((name==null || name.trim().isEmpty()));
		
		return name;
		
		}
		
		
		public  static double readSalary(Scanner input) {
			double salary;
		
		do {
			System.out.println("Type your salary greater than zero");
			salary=input.nextDouble();
			
		} while (salary<=0);
		return salary;
		
	}
		
		public static int readTime(Scanner input) {
		 int time;
		do {
			System.out.println("Length of service:");
			time=input.nextInt();
		} while (time<=0);
			return time;
		}
		
		

		public static double calculeNewSalary(double salary, int time) {
		
		 if(time >=5) {
			return salary*1.2;
			
		}else if(time>=3) {
			return salary*1.1;
			
		}else {
			return salary*1.05;
		}
		
	}
		
			
		
		public static void displayResults(String name, int time, double newSalary) {
		
			System.out.println("\nEmployee information");
		
			System.out.printf("Name: "+name);
			System.out.println("\nLength of service"+time);
			System.out.printf("New salary: $= %.2f%n", newSalary);
		}
		
		
}
