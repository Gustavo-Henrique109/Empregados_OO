package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		Department department = new Department(name, payDay, address);
		
		System.out.print("Quantos funcion�rios tem o departamento? ");
		int qtd = sc.nextInt();
		
		for (int i=0; i<qtd; i++) {
			sc.nextLine();
			System.out.printf("Dados do funcion�rio %d:\n", i+1);
			System.out.print("Nome: ");
			String empName = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double sal = sc.nextDouble();
			
			Employee employee = new Employee(empName, sal);
			
			department.addEmployee(employee);
		}
		
		showReport(department);
		
		sc.close();
	}
	
	private static void showReport(Department department) {
		System.out.println(department);
	}
}


























