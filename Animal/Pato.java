import java.util.*;
// ------------------------------------------------------------HEREDANDO DE "Mascota"
public class Pato extends Mascota{
	private final static String FOOD = "algas y piedras";
	private final static String NAME = "Fua";
	private String ruiditos = "CCCUUUUUAAAAAAAACCCCCCC!!!\n";
	private final static int PROB_CRIAR = 6;
	private final static int CAGADAS = 1;
//----------------------------------------------------------------------CONSTRUCTORES
	public Pato(){
		this(NAME, GENER, FOOD);
	}
	public Pato(String nombre){
		this(nombre, GENER, FOOD);
	}
	public Pato(String nombre, String sexo){
		this(nombre, sexo, FOOD);
	}
	public Pato(String nombre, String sexo, String comidaFavorita){
		this.setNombre(nombre);
		this.setComidaFavorita(comidaFavorita);
		this.setSexo(sexo);
	}
	public Pato(Pato pato){
		this.setNombre(pato.nombre);
		this.setComidaFavorita(pato.alimentacion);
		this.setSexo(pato.sexo);
	}
//----------------------------------------------------------------------------GET/SET
	public void setRuiditos(String ruiditos){
		this.ruiditos = ruiditos;
	}
	public String getSexo(){
		String genero = "un bonito pato.\n";
		if (this.sexo) genero = "una bonita pata.\n";
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
		return "cuuaAAACC\n";
	}
	public String dormir(){
		return "Zzzzz.. cuacuacua...\n";
	}
	public String comer(){
		return "Mmmm " + this.alimentacion + ".\nPACU PACU!\n";
	}
	public String follar(){
		return this.teniendoSexo(this.ruiditos, this.PROB_CRIAR);
	}
	public String excretar(){
		return this.excreta(CAGADAS);
	}


}
