import java.util.ArrayList;
import java.util.Scanner;


public class UsedCar extends Car {
	private double mileage;
	private boolean used = true;
	
	
	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
	}


	public UsedCar(String brand, String model, int year, double price, double mileage ) {
		super(brand, model, year, price);
		this.mileage = mileage;
	}
	
	
	public UsedCar() {
		// TODO Auto-generated constructor stub
	}


	public double getMileage() {
		return mileage;
	}


	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public void carList(ArrayList<Car> list) {
		Car c1 = new Car("Tesla", "Model S", 2017, 54999.90);
		Car c2 = new Car("Fourd", "Escapade", 2017, 31999.90);
		Car c3 = new Car("Chewie", "Vette", 2017, 44989.95);
		UsedCar c4 = new UsedCar("Honda", "Prior", 2015, 14795.50, 35987.6);
		UsedCar c5 = new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0);
		UsedCar c6 = new UsedCar("Ford", "Escape", 2013, 8500.00, 12345.0);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + list.get(i).toString());
		}
	}
	

	@Override
	public String toString() {
		return  String.format("   %-15s %-13s %-15d $%.2f %13s %12.2f Miles\n", getBrand(), getModel(), 
				getYear(), getPrice(), "(used)", mileage);
	}

	
}
