
// ------------------------------------------------------ PARA COMPILAR TODOS LOS ARCHIVOS DE LA CARPETA:
// javac *.java



import java.util.*;

public class Main{
	public static void main(String[] args){
		Cuenta miCuenta = new Cuenta("Pablo", 7000);
		Cuenta tuCuenta = new Cuenta("Raquel");
		System.out.println(miCuenta);

		miCuenta.setSaldo(3000);
		System.out.println(miCuenta);

		miCuenta.ingresar(2500);
		System.out.println(miCuenta);

		miCuenta.retirar(500);
		System.out.println(miCuenta);

		tuCuenta.ingresar(2500);
		System.out.println(tuCuenta);

		System.out.println(tuCuenta.getSaldo());

		System.out.println(miCuenta.getTitular());


	}
}