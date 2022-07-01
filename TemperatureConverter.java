
public class TemperatureConverter extends Converter{
	
	public TemperatureConverter() {
		  
	}
	public TemperatureConverter(double input) {
		
		super(input); 
	}
	//converts input Fahreheit temperature to Celsius 
	public double convert() {
		setInput(((getInput()-32)*5)/9); 
		return getInput(); 
	}
	
}

