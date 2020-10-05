package cse360assignment01;

/**
 * The class AddingMachine is used to add and subtract from a running total 
 * which is stored in a variable. The "memory" will also be stored in a string
 * which can be accessed by the user of the program. 
 * 
 * @author  Rebecca Knoche
 * @version 0.1
 * @since 2020-10-05
 */

public class AddingMachine {
	//instance variables
	private int total;
	private int temp; 
	private String result;

	//constructor which instantiates instance variables
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		temp = 0;
		result = "0";
	}
	
	/**
	 * This method is used to retrieve an integer value
	 * @return values is 0
	 */

	public int getTotal () {
		return total;	//return value
	}

	/**
	 * This method is used to add an integer to the variable total.
	 * @param value is the only parameter of the method add.
	 * this is a void method and will not return any value type
	 */

	public void add (int value) {
		temp = total; //holds initial value of total before operation occurs
		total += value;	//performs addition
		toString(); //updates "memory" or operations performed
	}

	/**
	 * This method is used to subtract an integer from the variable total.
	 * @param value is the only parameter of the method subtract.
	 * this is a void method and will not return any value type
	 */

	public void subtract (int value) {
		temp = total; //holds initial value of total before operation occurs
		total -= value;	//performs subtraction
		toString();	//updates "memory" or operations performed
	}

	/**
	 * This method is used to store a "memory" of operations that were 
	 * performed on the variable total.
	 * @return value is an empty String
	 */

	public String toString () 
	{
		//local variables
		String sign = "";	//empty string
		int value = 0;	//sets value to 0
		//checks if subtraction was performed
		if(temp > total) {
			sign = "-";	//sets sign as subtraction
			value = temp - total;	//determines absolute value of what the total was subtracted by
		}
		else {
			sign = "+";	//sets sign as addition
			value = total - temp; //determines how much was added to the total
		}

		result += " " + sign + " " + value + " "; //updates result string to include most recent operation (sign and value)

		return result;	//returns String result
	}

	/**
	 * This method is used to clear the "memory" of operations that were 
	 * performed.
	 * this is a void method and will not return any value type
	 */

	public void clear() {
		total = 0;	//sets total to 0
		result = "0";	//resets "memory" of the string which contained the addition/subtraction steps
	}

}

