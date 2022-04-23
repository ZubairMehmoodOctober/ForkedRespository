import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "Car is Build");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "Convertible Car is started");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar c1 = this.Car;
		c1.lowerTop();
		boolean LowerTop = c1.lowerTop();
		assertTrue (LowerTop, "c1 is lower");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar c2 = this.Car;
		c2.raiseTop();
		boolean RaiseTop = c2.raiseTop();
		assertTrue (RaiseTop, "c2 is higher");
	}
}
