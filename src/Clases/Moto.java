package Clases;

public class Moto extends Vehiculo{

	public Moto(String marca) {
		super(marca);
	}
	
	@Override
	public void conducir() {
		System.out.println("Conduciendo una moto de marca "+ super.marca);
	}
	
	
}
