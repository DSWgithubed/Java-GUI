
public class DistanceConverter extends Converter{
	
	//empty constructor 
	DistanceConverter(){
		
	}
	
	public DistanceConverter(double input){
		super(input); 
	}
	
	//Converts the distance from miles 
	public double convert() {
		setInput(((getInput()*1.609))); 
		return getInput(); 
	}
	
	

}
