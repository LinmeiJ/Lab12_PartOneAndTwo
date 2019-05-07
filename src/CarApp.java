import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	/******** @Author: Linmei Mills ************/

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Motors admin Console!");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<Car>();
		UsedCar uCar = new UsedCar();
//		creatingMultipleInstance(scanner, cars); //user Input cars for Lab 12 part 1
		
		uCar.carList(cars);
		selectCar(scanner, cars); //Lab 12 part 2
		

	}
	
	public static void creatingMultipleInstance(Scanner scanner, ArrayList<Car> cars) {
		//creating multiple instances
		int num = Validator.getInt(scanner, "How many cars are you entering?");
		for(int i = 0; i < num; i++) {
			String brand = Validator.getString(scanner, "Enter the brand of car #" + (i + 1) + ": ");
			String model = Validator.getString(scanner, "Enter the brand of car #" + (i + 1) + ": ");
			int year = Validator.getInt(scanner, "Enter the year of car #" + (i + 1) + ": ");
			if(year > 2019) {
				System.out.println("(Uhhh...Are you from the future?!)"); //haha
			}
			double price = Validator.getDouble(scanner, "Enter the price of car #" + (i + 1) + ": ");
			cars.add(new Car(brand, model, year, price));
		}	
		displayInputList(cars);
	}

	private static void displayInputList(ArrayList<Car> cars) {
		Validator.tableFormat();
		for(int i = 0; i <cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}
	
	public static void selectCar(Scanner sc, ArrayList<Car> list) {
		int num = Validator.getInt(sc, "Which car would you like? ");
		if(num < list.size() || num > 0) {
			System.out.println("You have select the car below: ");
			System.out.println(list.get(num - 1));
			boolean i = true;
			while(i) {
				String buy = Validator.getStringMatchingRegex(sc, "Would you like to buy this car?(y/n)", "[yYnN ]");
				if(buy.equalsIgnoreCase("y")){
					System.out.println("Excellent! Our finance department will be in touch shorty.");
					list.remove(list.indexOf(list.get(num - 1)));
					i = false;
					for(int j = 0; j < list.size(); j++) {
						System.out.println((j+1) + list.get(j).toString());
					}
					System.out.println("Have a good day!");
				}
				else System.out.println("Invalid Entry");
			}
			
		}
		else System.out.println("Car is not found!");
	}
	

}
