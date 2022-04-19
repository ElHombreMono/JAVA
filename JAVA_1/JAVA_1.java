
// ------------------------------------------------------ PARA COMPILAR:
// javac JAVA_1.java
// java JAVA_1



import java.util.Scanner;

public class JAVA_1{								// Debe llamarse = que el archivo
	public static void main (String[] args){		// ESTA CLASE SIEMPRE


		System.out.println("Hola mundo");

		String numeroString = "10";
		int num, numero1 = 10, numero2 = 20;
		int dia;
		int[] listaNum = {7,3,4,9,12,65,3,90,2,65,23,17,53,82,45,56,5,4,45,72,45,1,35,765};
		int [][] matrizNum = {{0,1,2,3}, {4,5,6}, {7,8,9}};

		String nombre;
		Scanner sc = new Scanner (System.in);		// CREAMOS UN SCANNER
		boolean buleano = true;

		System.out.println("si usamos \"println\"");
		System.out.println("¿Cómo te llamas?");
		nombre = sc.nextLine(); 					// PIDE POR PANTALLA
		System.out.println("Hola " + nombre + "!");

		System.out.println("si usamos \"print\" sin \"nl\"");
		System.out.print("¿Cómo te llamas? ");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre + "!");

		System.out.println("Imprimo el buleano a true: " + buleano);
		buleano = false;

		System.out.println("Imprimo el buleano a false: " + buleano);
		System.out.println("Un buleano solo puede tener valores tipo String (true o false), nunca 0 ó 1.");


		// ----------------------------------------- CASTING AUTOMÁTICO:
		/*
		byte bytee = 9;								// PODEMOS CAMBIAR EL TIPO DE DATO
		short corto = bytee;
		int entero = corto;
		long largo = entero;
		float flotante = largo;
		double doble = flotante;
		System.out.println(flotante);

		int letra = 65;
		char caracter = (char)letra;				// PODEMOS PASAR DE INT A CHAR (ASCI)
		System.out.println(caracter);

		doble = 9.47;
		entero = (int)doble;
		System.out.println(entero);

		entero++;
		System.out.println(entero);
		*/


		// ----------------------------------------------------- STRING:
		/*
		System.out.println(nombre);
		System.out.println(nombre.toUpperCase());	// PODEMOS PASAR A MAYÚSCULAS AL IMPRIMIR
		System.out.println(nombre);
		nombre = nombre.toUpperCase();				// O PASAR LA VARIABLE A MAYÚSCULAS
		System.out.println(nombre);
		System.out.println(nombre.toLowerCase());
		*/

		/*
		System.out.println(numero1 + numero2);		// EL PRIMER OPERADOR CONDICIONA LA ACCIÓN

		System.out.println(numeroString + numero2);	// CONCATENA O SUMA
		System.out.println(numeroString + numero1 + numero2);
		System.out.println(numero1 + numero2 + numeroString);
		*/

		// ---------------------------------------------- GESTIÓN DE DATOS:
		/*
		if (numero1 < numero2){
			System.out.println("Numero1 es menor.");
		} else if (numero2 < numero1) {
			System.out.println("Numero2 es menor.");
		} else {
			System.out.println("Los dos números son iguales.");
		}

		numeroString = (numero1 < numero2) ? "Numero1 es menor." : "Numero2 es menor.";
		System.out.println(numeroString);			// FORMA ABREVIADA = QUE C++
		*/

		/*
		dia = 4;
		switch(dia){								// ESTO NO SE USA CASI NADA
			case 1:
				System.out.println("Hoy es Lunes.");
				break;
			case 2:
				System.out.println("Hoy es Martes.");
				break;
			case 3:
				System.out.println("Hoy es Miércoles.");
				break;
			case 4:
				System.out.println("Hoy es Jueves.");
				break;
			case 5:
				System.out.println("Hoy es Viernes.");
				break;
			case 6:
				System.out.println("Hoy es Sábado.");
				break;
			case 7:
				System.out.println("Hoy es Domingo.");
				break;
			default:
				System.out.println("El mundo tal y como lo conocemos ha desaparecido, ya no hay dias de la semana.");
		}

		for (int i = 0; i < listaNum.length-1; i++){ 	// OJO!!! LENGTH SIN PARÉNTESIS!!!
			System.out.print(listaNum[i] + " - ");
		}
		System.out.println(listaNum[listaNum.length-1]);	// ME TIRO EL MOCO

		int cont = 0;
		while (cont < listaNum.length-1){
			System.out.print(listaNum[cont] + " - ");
			cont++;
		}
		System.out.println(listaNum[listaNum.length-1]);

		for(int i : listaNum){				// ME PARECE FEO NO PODER SEPARAR EL ÚLTIMO Nº
			System.out.print(i + " - ");	// ME SOBRA EL ÚLTIMO "-"
		}
		*/
		
		// int [][] matrizNum = {{0,1,2,3}, {4,5,6}, {7,8,9}};
		for (int i = 0; i < matrizNum.length; i++){
			for (int j = 0; j < matrizNum[i].length-1; j++){
				System.out.print(matrizNum[i][j] + " - ");
			}
			System.out.println(matrizNum[i][matrizNum[i].length-1]);
		}



	}
}