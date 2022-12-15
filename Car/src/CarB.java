public class CarB {

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
}