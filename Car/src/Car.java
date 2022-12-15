
public class Car {

	public String brand;
	public String model;
	public int amountOfFuel;

	
	public void brake() {
		System.out.println("Car is breaking");
	    }
		public void accelerate() {
			System.out.println("Car is accelerating");
			amountOfFuel = amountOfFuel-1;   
		}
		public void PrintData() {
			System.out.println("brand: " + brand);
			System.out.println("model: " + model);
			System.out.println("amount of fuel: " + amountOfFuel);
		}
		
		
		
	public static void main(String[] args) {
		
		CarB car1 = new CarB();
	    car1.brand = "Fiat";
	    car1.model = "500";
	    car1.amountOfFuel = 50;
	    car1.PrintData();
	    car1.brake();
	    car1.accelerate();
	    car1.PrintData();
	}
}
