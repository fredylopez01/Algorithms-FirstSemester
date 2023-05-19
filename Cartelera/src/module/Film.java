package module;

public class Film {
	public String titulo = "";
	public String director = "";
	public String genero;
	public int duracion;
	public int calificacion = 0;
	
	
	public void imprimir() {
		System.out.println("---" + titulo + "---" );
		
		if (calificacion == 1) {
			System.out.println("*");
		} else if (calificacion == 2) {
			System.out.println("**");
		} else if (calificacion == 3) {
			System.out.println("***");
		} else if (calificacion == 4) {
			System.out.println("****");
		} else if (calificacion == 5) {
			System.out.println("*****");
		} 
		
		if (duracion > 180) {
		System.out.println(genero + "(Epica)");
		} else if (duracion < 179) {
			System.out.println(genero);
		}
		System.out.println(director);
		
	}
}
