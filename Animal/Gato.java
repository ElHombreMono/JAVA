import java.util.*;
// ------------------------------------------------------------HEREDANDO DE "Mascota"
public class Gato extends Mascota{
	private final static String FOOD = "queso";
	private final static String NAME = "Misa";
	private String ruiditos = "NNNGGGAAAAAAAAWWW!!!\n";
	private final static int PROB_CRIAR = 9;
	private final static int CAGADAS = 3;
//----------------------------------------------------------------------CONSTRUCTORES
	public Gato(){
		this(NAME, GENER, FOOD);
	}
	public Gato(String nombre){
		this(nombre, GENER, FOOD);
	}
	public Gato(String nombre, String sexo){
		this(nombre, sexo, FOOD);
	}
	public Gato(String nombre, String sexo, String comidaFavorita){
		this.setNombre(nombre);
		this.setComidaFavorita(comidaFavorita);
		this.setSexo(sexo);
	}
	public Gato(Gato gato){
		this.setNombre(gato.nombre);
		this.setComidaFavorita(gato.alimentacion);
		this.setSexo(gato.sexo);
	}
//----------------------------------------------------------------------------GET/SET
	public void setRuiditos(String ruiditos){
		this.ruiditos = ruiditos;
	}
	public String getSexo(){
		String genero = "un bonito gato.\n";
		if (this.sexo) genero = "una bonita gata.\n";
		return "Soy " + genero;
	}
	public String getRuiditos(){
		return "Cuando chingo hago \"" + this.ruiditos + "\".";
	}
	public String toString(){
		String fin = "Yo siempre estoy disponible y dispuesto.\n";
		if (this.sexo){
			fin = "Ahora mismo estoy disponible... you now.\n";
			if (this.cria) fin = "En unos dias seremos mas bocas que alimentar...\n";
		}
		return "Hola! " + this.getSexo() + "Me llamo " + this.nombre + " y mi comida favorita es " + this.alimentacion + ".\nAhora mismo... " + this.getHigiene() + fin;
	}
//----------------------------------------------------------------------OTROS MÉTODOS
	public String hablar(){
		return "Miiaauu\n";
	}
	public String dormir(){
		return "Zzzzz.. GggrrrrRRRgGRRRgGgRr..\n";
	}
	public String comer(){
		return "Mmmm " + this.alimentacion + ".\nGNAM GNAM!\n";
	}
	public String follar(){
		return this.teniendoSexo(this.ruiditos, this.PROB_CRIAR);
	}
	public String excretar(){
		return this.excreta(CAGADAS);
	}


}
