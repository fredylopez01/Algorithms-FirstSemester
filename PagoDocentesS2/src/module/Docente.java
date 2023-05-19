package module;
import java.util.Scanner;

public class Docente {
	Scanner input = new Scanner(System.in);
	public long id = 0;
	public String name = "";
	public String category = "";
	public int hours = 0;
	public double salary = 0;
	
	public Docente(long id, String name, String category, int hours) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.hours = hours;
	}
	
	public double sueldo() {
		if (category.equalsIgnoreCase("a")) {
			salary = hours*25000;
		} else if (category.equalsIgnoreCase("b")) {
			salary = hours*35000;
		} else if(category.equalsIgnoreCase("c")) {
			salary = hours*50000;
		}
		return salary;
	}
	
}
