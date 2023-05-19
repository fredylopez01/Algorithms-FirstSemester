package test;
import model.Business;
import model.Department;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Ingrese las ventas totales del departamento 1: ");
		double department1TotalSales = console.nextDouble();

		System.out.print("Ingrese las ventas totales del departamento 2: ");
		double department2TotalSales = console.nextDouble();		
		
		System.out.print("Ingrese las ventas totales del departamento 3: ");
		double department3TotalSales = console.nextDouble();
		
		Department department1 = new Department(department1TotalSales);
		
		Department department2 = new Department(department2TotalSales);
		
		Department department3 = new Department(department3TotalSales);
		
		Business business1 = new Business();
			business1.setDepartment1(department1);
			business1.setDepartment2(department2);
			business1.setDepartment3(department3);
		
		double salaryd1 = business1.totalSalaryD1();
		double salaryd2 = business1.totalSalaryD2();
		double salaryd3 = business1.totalSalaryD3();
		
		System.out.println("El salario del los trabajadores del departamento 1 es = "+salaryd1);
		System.out.println("El salario del los trabajadores del departamento 2 es = "+salaryd2);
		System.out.println("El salario del los trabajadores del departamento 3 es = "+salaryd3);
	
	}

}
