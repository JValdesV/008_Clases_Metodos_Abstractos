package Clases;

public class Coche extends Vehiculo{

	public Coche(String marca) {
		super(marca);
	}

	@Override
	public void conducir() {
		System.out.println("Conduciendo un coche de marca " + super.marca);
	}
	
	

	
	
}
