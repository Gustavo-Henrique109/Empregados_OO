package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, Integer payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Double payroll() {
		double sum = 0;
		for (Employee obj : employees) {
			sum += obj.getSalary();
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFOLHA DE PAGAMENTO:\n");
		sb.append("Departamento Vendas = R$ " + String.format("%.2f\n", payroll()));
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionários: \n");
		
		for(Employee obj : employees) {
			sb.append(obj.getName() + "\n");
		}
		
		sb.append("Para dúvidas favor entrar em contato: " + address.getEmail());
		 
		return sb.toString();
	}
}





























