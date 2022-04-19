
import java.util.Scanner;

public class Persona{
	private String nombre;
	private String dni;

	// -------------------------------------------------- CONSTRUCTORES:
	public Persona(){
		this.nombre = "Pablo";
		this.dni = "12345678A";
	}

	// --------------------------------------------------------toString:
	public String toString(){
		return "Me llamo " + this.nombre + " y mi dni es " + this.dni + ".";
	}
}
