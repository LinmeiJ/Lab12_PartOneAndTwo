
public class Car {
	private String brand;
	private String model;
	private int year;
	private double price;
	
	public Car() {
	
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.brand = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMake() {
		return brand;
	}

	public void setMake(String make) {
		this.brand = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  String.format("   %-15s %-13s %-15d $%.2f\n", brand, model, year, price);
	}
}
