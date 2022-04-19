
// ------------------------------------------------------ PARA COMPILAR TODOS LOS ARCHIVOS DE LA CARPETA:
// javac *.java



import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Persona miPersona = new Persona("Pepe", "98765432Z");
		miPersona.setNombre("Celia");
		System.out.println( "DNI: " + miPersona.getDni());
		System.out.println(miPersona);
	}
}
