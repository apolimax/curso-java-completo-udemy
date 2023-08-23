package exercio_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many employees? ");
		int n = scan.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario f = new Funcionario();
			
			System.out.printf("Employee %d:", i);
			
			System.out.print("Id: ");
			f.setId(scan.nextLine());
			
			System.out.print("Name: ");
			f.setNome(scan.nextLine());
			
			System.out.print("Salary: ");
			f.setSalario(scan.nextInt());
		}
		
		System.out.print("Enter employee id to have a raise in salary? ");
		int r = scan.nextInt();
		
		System.out.print("Percentage? ");
		int p = scan.nextInt();
		
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

}
