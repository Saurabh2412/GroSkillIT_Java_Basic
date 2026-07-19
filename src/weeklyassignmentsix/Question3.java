package weeklyassignmentsix;

class Vehicle{
	
	String brand;
	int year;
	
	Vehicle(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
	}
	void displayVehicleInfo()
	{
		System.out.println("Vehicle Information:");
		System.out.println("Brand: "+brand);
		System.out.println("Year: "+year);
	}
}

class Car extends Vehicle{
	
	String model;
	
	Car(String brand, int year, String model)
	{
		super(brand,year);
		this.model=model;
	}
	
	@Override
	void displayVehicleInfo()
	{
		super.displayVehicleInfo();
		
		System.out.println("Car Information:");
		System.out.println("Model: "+model);
	}
	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("Toyota",2023 ,"Fortuner");
		c1.displayVehicleInfo();

	}

}
