public class Car extends MotorizedVehicle {
	private int odometer;
	private boolean CanStartCar;
   
	public Car(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}
	
	public int getOdometer() {
		return odometer;
	}
	public void CanStartCar () {
		this.CanStartCar = true;
	}
	
}
