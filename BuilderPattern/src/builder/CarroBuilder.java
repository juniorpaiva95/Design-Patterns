package builder;

import modelo.CarroProduct;

public class CarroBuilder implements Builder <CarroBuilder, CarroProduct>{
	private final String model;
	private double price;
	private String engineDescription;
	private int yearOfManufacture;
	private String automaker;

	public CarroBuilder (String model) {
		this.model=model;
	}

	@Override
	public CarroBuilder price(double price) {
		this.price = price;
		return this;
	}

	@Override
	public CarroBuilder engineDescription(String engineDescription) {
		this.engineDescription = engineDescription;
		return this;
	}

	@Override
	public CarroBuilder yearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
		return this;
	}
	
	@Override
	public CarroBuilder automaker(String automaker) {
		this.automaker=automaker;
		return this;
	}

	@Override
	public CarroProduct create() {
		CarroProduct c = new CarroProduct();
		c.setModel(this.model);
		c.setPrice(this.price);
		c.setYearOfManufacture(this.yearOfManufacture);
		c.setEngineDescription(this.engineDescription);
		c.setAutomaker(automaker);
		return c;
	}
}