
// ------------------------------------------------------ PARA COMPILAR TODOS LOS ARCHIVOS DE LA CARPETA:
// javac *.java



import java.util.*;

public class Cuenta{
	String titular;
	double saldo;

	public Cuenta(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
	}
	public Cuenta(String titular){
		this.titular = titular;
		this.saldo = 0;
	}
	public Cuenta(Cuenta miCuenta){
		this.titular = miCuenta.titular;
		this.saldo = miCuenta.saldo;
	}
	public Cuenta(){
		Scanner sc = new Scanner (System.in);
		String titular;
		double saldo;
		System.out.print("Introduce el NOMBRE del TITULAR: ");
		titular = sc.nextLine();
		System.out.print("Introduce el SALDO actual de la cuenta: ");
		saldo = sc.nextDouble();
		this.titular = titular;
		this.saldo = saldo;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public String getTitular(){
		return this.titular;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public String toString(){
		return "Hola, " + this.titular + ". Su saldo actual es " + String.format("%.2f", this.saldo) + " EUROS.";
	}
	public double ingresar(double ingreso){
		double respuesta;
		if (ingreso > 0){
			this.saldo += ingreso;
			respuesta = this.saldo;
		}
		else respuesta = -1;
		return respuesta;
	}
	public double retirar(double retirada){
		double respuesta;
		if (retirada > 0){
			if (this.saldo < retirada){
				this.saldo = 0;
			}
			else this.saldo = this.saldo - retirada;
		respuesta = this.saldo;
		}
		else respuesta = -1;
		return respuesta;
	}
}