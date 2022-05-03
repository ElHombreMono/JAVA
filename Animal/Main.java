

public class Main{
	public static void main(String[] args){
//		----------------------------------------------No podemos instanciar objetos de clases abstractas.
//		Animal miAnimal = new Animal();
//		System.out.println(miAnimal.durmiendo());

		Pato mengana = new Pato("Mengana", "f", "algas y piedras");
		Gato fulano = new Gato("Fulano", "M", "raspas de pescado");
		Gato miGata = new Gato();
		Pato clonMengana = new Pato(mengana);

		System.out.println(mengana.toString());
		System.out.println(mengana.hablar());
		System.out.println(mengana.getComidaFavorita());
		System.out.println(mengana.comer());
		System.out.println(mengana.follar());
		System.out.println(mengana.getEstado());
		System.out.println(mengana.getSexo());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.pegar());
		System.out.println(mengana.pegar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.getHigiene());
		System.out.println(mengana.limpiar());
		System.out.println(mengana.toString());
		System.out.println(fulano.toString());
		System.out.println(miGata.toString());
		System.out.println(clonMengana.toString());
	}
}