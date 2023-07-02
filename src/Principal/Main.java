package Principal;

import Clases.Coche;
import Clases.Moto;

public class Main {

	public static void main(String[] args) {
		
		Coche coche = new Coche("Toyota");
		coche.conducir();
		
		Moto moto = new Moto("Yamaha");
		moto.conducir();

	}

}
