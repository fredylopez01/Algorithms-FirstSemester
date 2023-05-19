package test;

import java.util.Scanner;

public class Wrapper {
	Scanner input = new Scanner(System.in);
	byte a;
	int b;
	float c;
	double d;
	char e;
	Byte objetoByte;
	Integer objetoInteger;
	Float objetoFloat;
	Double objetoDouble;
	Character objetoChar;
	
	public void initValues() {
		System.out.println("");
		System.out.println("Ingrese los valores por cada tipo par que sean evaluados");
		System.out.print("Ingrese el valor para el tipo de dato byte: ");
		a = input.nextByte();
		System.out.print("Ingrese el valor para el tipo de dato int: ");
		b = input.nextInt();
		System.out.print("Ingrese el valor para el tipo de dato float: ");
		c = input.nextFloat();
		System.out.print("Ingrese el valor para el tipo de dato double: ");
		d = input.nextDouble();
		System.out.print("Ingrese el valor para el tipo de dato char: ");
		e = input.next().charAt(0);
	}
	
	
	public void convert() {
		System.out.println("Bienvenido.");
		System.out.println("Primero debe ingresar datos segun su tipo para hacer conversiones ");
		System.out.println("respectivas, luego ingrese la letra para que se evaluada");
		initValues();
		System.out.println("");
		System.out.println("-------------Convertir a Wrapper----------------");
		objetoByte = new Byte(a);
		objetoInteger = new Integer(b);
		objetoFloat = new Float(c);
		objetoDouble = new Double(d);
		objetoChar = e;
		System.out.println("Objeto Byte = " + objetoByte);
		System.out.println("Objeto Integer = " + objetoInteger);
		System.out.println("Objeto Float = " + objetoFloat);
		System.out.println("Objeto Double = " + objetoDouble);
		System.out.println("Objeto Character = " + objetoChar);
		
			System.out.println("");
			System.out.println("-------------Convertir a Primitivo----------------");
			byte tipoByte = objetoByte;
			int tipoInt = objetoInteger;
			float tipoFloat = objetoFloat;
			double tipoDouble = objetoDouble;
			char tipoChar = objetoChar;
			System.out.println("");
			System.out.println("Tipo byte = " + tipoByte);
			System.out.println("Tipo int = " + tipoInt);
			System.out.println("Tipo float = " + tipoFloat);
			System.out.println("Tipo double = " + tipoDouble);
			System.out.println("Tipo char = " + tipoChar);
		
	}
	
	public void consultarChar() {
		System.out.println("");
		System.out.println("------------------------Evaluar Letra-------------------");
		System.out.println("Ingrese el caracter que desea que sea evaluado");
		e = input.next().charAt(0);
		boolean esMiníscula = Character.isLowerCase(e);
		System.out.println("¿La letra: " + e + " está en minúscula? = " + esMiníscula);
		boolean esMayúscula = Character.isUpperCase(e);
		System.out.println("¿La letra: " + e + " está en mayúscula? = " + esMayúscula);
		boolean esLetra = Character.isLetter(e); 
		System.out.println("¿La letra:" + e + " está una letra? = " + esLetra);
		boolean esDigito = Character.isDigit(e); 
		System.out.println("¿La letra: " + e + " es un dígito? = " + esDigito);
		char charMinúscula = Character.toLowerCase(e);
		System.out.println("La letra: " + e + " convertido a minúscula = " + charMinúscula);
	}
}
