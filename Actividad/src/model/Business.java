package model;

public class Business {
	private Department department1;
	private Department department2;
	private Department department3;
	
	public double totalSalaryD1() {
		double response;
		
		if(department1.getTotalSales()>(0.33*totalValueE())) {
			response = 690000*0.20+690000;
		}else {
			response = 690000;
		}
		return response;
		
	}
	public double totalSalaryD2() {
		double response;
		
		if(department2.getTotalSales()>(0.33*totalValueE())) {
			response = 690000*0.20+690000;
		}else {
			response = 690000;
		}
		return response;
		
	}	
	public double totalSalaryD3() {
		double response;
		
		if(department3.getTotalSales()>(0.33*totalValueE())) {
			response = 690000*0.20+690000;
		}else {
			response = 690000;
		}
		return response;
		
	}
	public double totalValueE() {
		double totalValueE = department1.getTotalSales()+department2.getTotalSales()+department3.getTotalSales();
		return totalValueE;
	}
		
	public void setDepartment1(Department department1) {
		this.department1 = department1;
	}
	public void setDepartment2(Department department2) {
		this.department2 = department2;
	}
	public void setDepartment3(Department department3) {
		this.department3 = department3;
	}
}
