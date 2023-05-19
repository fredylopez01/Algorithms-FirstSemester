package module;

public class Student {
	public int code = 0;
	public String name = "";
	public String program = "";
	public String scholarship = "";
	public double worthM = 0;
	public double vDiscount = 0;
	public double tEnrollment = 0;
	
	public Student(int code, String name, String program, String scholarship) {
		this.code = code;
		this.name = name;
		this.program = program;
		this.scholarship = scholarship;
	}
	
	public void cWorth() {
		if (program.equalsIgnoreCase("tecnico en sistemas")) {
			worthM = 800000;
		} else if(program.equalsIgnoreCase("tecnico en desarrollo de videojuegos")) {
			worthM = 1000000;
		} else if(program.equalsIgnoreCase("tecnico en animacion digital")) {
			worthM = 1200000;
		} 
		System.out.println("Valor de matricula: " + worthM);
	}
	
	public void cDiscount() {
		if (scholarship.equalsIgnoreCase("beca por rendimiento academico")) {
			vDiscount = worthM*0.50;
		} else if(program.equalsIgnoreCase("beca cultural-deportes")) {
			vDiscount = worthM*0.40;
		} else if(program.equalsIgnoreCase("sin beca")) {
			vDiscount = 0;
		} 
		System.out.println("Valor de decuento: " + vDiscount);
	}
}
