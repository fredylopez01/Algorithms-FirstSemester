package presenter;

import module.Employee;
import view.View;

public class Presenter {
	View view;
	public Employee[] listEmployee = new Employee[4];
	  
	  public void cargar() {
		    for (int f = 0; f < listEmployee.length; f++) {
		    	listEmployee[f].name = view.readName("Ingrese el nombre del empleado: ");
		    	listEmployee[f].salaryOne = view.readInt("Ingrese sueldo: ");
		    	listEmployee[f].salaryTwo = view.readInt("Ingrese sueldo: ");
		    	listEmployee[f].salaryThree = view.readInt("Ingrese sueldo: ");
		    }
		  }
	   
	  public void imprimirTotalPagado() {
		    view.showMessage("Total de sueldos pagados por empleado.");
		    for (int f = 0; f < listEmployee.length; f++) {
		    	view.showMessage(listEmployee[f].name + " - " + listEmployee[f].suma());
		    }
		  }
	  
	  public void empleadoMayorSueldo() {
		    double may = listEmployee[0].suma();
		    String nom = listEmployee[0].name;
		    for (int f = 0; f < listEmployee.length; f++) {
		      if (listEmployee[f].suma() > may) {
		        may = listEmployee[f].suma();
		        nom = listEmployee[f].name;
		      }
		    }
		    view.showMessage("El empleado con mayor sueldo es " + nom + " que tiene un sueldo de " + may);
		  }
	  
	  public static void main(String[] args) {
		    Presenter one = new Presenter();
		    one.cargar();
		    one.imprimirTotalPagado();
		    one.empleadoMayorSueldo();
		  }
}