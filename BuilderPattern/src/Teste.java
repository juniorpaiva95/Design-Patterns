import builder.CarroBuilder;
import modelo.CarroProduct;

public class Teste {
	public static void main(String[] args) {	
		CarroProduct carro1 = new CarroBuilder("Renault Sandero")
									.yearOfManufacture(2010)
									.engineDescription("Motor 1.4")
									.price(20000)
									.automaker("Renault")
									.create();
		
		CarroProduct carro2 = new CarroBuilder("Fiat Uno")
									.engineDescription("motor alguma coisa")
									.yearOfManufacture(2010)
									.automaker("Fiat").create();			
		
		System.out.println("Carro 1");
		System.out.println(carro1);
		
		System.out.println("\nCarro 2 - SEM PREÇO");
		System.out.println(carro2);
		
		System.out.println("\nCarro 2 - COM PREÇO");
		carro2.setPrice(12000);
		System.out.println(carro2);
	}
}
