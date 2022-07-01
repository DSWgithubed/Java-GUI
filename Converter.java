//David Warren CMIS 242 
//This program will present an GUI to a user and request some input.
//This program will take the input and convert it to either another distance type or temperature type
public class Converter {//parent class for all the other child classes

	private double input; 
	
	//Empty Constructor with no parameter
	public Converter () {
		this.input = Double.NaN; 
	}

	//Overloaded Constructor with input double parameter
	public Converter (double input) {
		this.input = input; 
	}
	
	
	public double getInput() {
		return input;
	}

	public void setInput(double input) {
		this.input = input;
	}
	
	public double convert() {
		return input; 
	}

	public static void main(String[] args) {
		
		GUIConverter doc = new GUIConverter(); //creates instance of the converter; which also displays the converter
		
		

	}

}
