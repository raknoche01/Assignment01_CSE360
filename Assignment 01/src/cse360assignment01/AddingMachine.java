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
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * This method is used to retrieve an integer value
	 * @return values is 0
	 */

	public int getTotal () {
		return 0;	//return value
	}

	/**
	 * This method is used to add an integer to the variable total.
	 * @param value is the only parameter of the method add.
	 * this is a void method and will not return any value type
	 */

	public void add (int value) {

	}

	/**
	 * This method is used to subtract an integer from the variable total.
	 * @param value is the only parameter of the method subtract.
	 * this is a void method and will not return any value type
	 */

	public void subtract (int value) {

	}

	/**
	 * This method is used to store a "memory" of operations that were 
	 * performed on the variable total.
	 * @return value is an empty String
	 */

	public String toString () {
		return "";	//return value
	}

	/**
	 * This method is used to clear the "memory" of operations that were 
	 * performed.
	 * this is a void method and will not return any value type
	 */

	public void clear() {
	}

}

