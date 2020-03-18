package task2Part2;

public class Airplane {
	
	private String brand;
	private int seatNumber;
	
	
	public Airplane(String brand, int seatNumber)
	{
		this.brand = brand;
		this.seatNumber = seatNumber;
		
	}
	
	public void displayAirplaneInfo(String brand, int seatNumber)
	{
		System.out.println("Brand: " + this.brand + " Seat number: " + this.seatNumber);
		
	}
	
	
}
