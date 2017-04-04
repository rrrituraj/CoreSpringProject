
public class MotorBike implements Vehicle {
	
	private int maxSpeed;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("fuelType : Petrol");
		System.out.println("maxSpeed : "+maxSpeed);
		System.out.println("Bike Started the happy Journey");
		
	}

}
