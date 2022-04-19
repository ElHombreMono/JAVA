
import java.util.Scanner;

public class Persona{
	private String nombre;
	private String dni;

	// -------------------------------------------------- CONSTRUCTORES:
	public Persona(){
		this.nombre = "Pablo";
		this.dni = "12345678A";
	}
	public Persona(String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	// -------------------------------------------------------- GET/SET:
	public String getNombre(){
		return this.nombre;
	}
	public String getDni(){
		return this.dni;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setDni(String dni){
		this.dni = dni;
	}

	// --------------------------------------------------------toString:
	public String toString(){
		return "Me llamo " + this.nombre + " y mi dni es " + this.dni + ".";
	}
}
