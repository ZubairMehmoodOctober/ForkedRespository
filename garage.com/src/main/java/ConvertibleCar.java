public class ConvertibleCar extends Car implements ICar {
       private boolean getIsLowerTop;
       private boolean getIsRaiseTop;
	   private boolean CanStartCar;
  
	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}
	public boolean lowerTop (){
		this.getIsLowerTop = true;
		return getIsLowerTop;
	}
	public boolean raiseTop () {
		this.getIsRaiseTop = true;
		return getIsRaiseTop;
	}
	public void CanStartConvertibleCar () {
		this.CanStartCar = true;
	}
}
