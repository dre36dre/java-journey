package fundamentals;

public class ClassificacaoFuncionario {

	public static void main(String[] args) {
		String name="Anderson";
		double salary=3000;
		double time=4;
		double newSalary=salary;
			
	
		
		System.out.println("Name: "+name);
		System.out.println("Salario atual: "+salary);
		System.out.println("Length of service with the company (in years): "+time);
		
		if(time >=5) {
			System.out.println("Receives a 20% increase.");
			newSalary=salary*1.2;
		}else if(time>=3 && time<=4) {
			System.out.println("Receives a 10% increase. ");
			newSalary=salary*1.1;
		}else {
			System.out.println("Receives a 5% increase: ");
			newSalary=salary*1.05;
		}
		
		System.out.printf("New salary: $= %.2f%n", newSalary);


	}
}