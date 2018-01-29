package modelo;

public class CarroProduct {
	  public double price;
	  public String engineDescription;
	  public int yearOfManufacture;
	  public String model;
	  public String automaker;
	  
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getEngineDescription() {
			return engineDescription;
		}
		public void setEngineDescription(String engineDescription) {
			this.engineDescription = engineDescription;
		}
		public int getYearOfManufacture() {
			return yearOfManufacture;
		}
		public void setYearOfManufacture(int yearOfManufacture) {
			this.yearOfManufacture = yearOfManufacture;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getAutomaker() {
			return automaker;
		}
		public void setAutomaker(String automaker) {
			this.automaker = automaker;
		}
		@Override
		public String toString() {
			return "CarroProduct [price=" + price + ", engineDescription=" + engineDescription + ", yearOfManufacture="
					+ yearOfManufacture + ", model=" + model + ", automaker=" + automaker + "]";
		}
		
	  
	  
	}