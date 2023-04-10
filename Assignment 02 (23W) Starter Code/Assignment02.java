/*
 * Student Name: Karamjot
 * Lab Professor: Professor David Haley
 * Due Date: March 31, 2023
 * Description: Assignment 02 (23W) Sample Solution - Update of original concept
 *              by Professor Stanley Pieda
 */
/*
 * this is class Assignment02. it takes the input for lumber dimensions
 * and check to give result in a form of string.
 */
public class Assignment02 {

	/*
	 * this the main method of class Assignment02. It starts with the while loop. takes an input for lumber
	 * dimensions and check them using working method of class LumberChecker. by using if statement we will close
	 * the while loop after taking a input of "no"
	 */
	public static void main(String[] args) {
		double thickness;
		double width;
		double length;
		String continue_program;
		boolean run = true;
		LumberChecker lumberChecker = new LumberChecker();
		User user = new User();
		DimensionalLumber dimensionalLumber = new DimensionalLumber();
		
		while(run) {
			
			System.out.println("Enter dimensions for lumber");
			System.out.println("Expected values for dimensions are \n1.50 for thickness, 5.50 for width, 192.00 for length");
			
			thickness = user.inputDouble("Enter measured thickness (inches): ");
			width = user.inputDouble("Enter measured width (inches): "); 
			length = user.inputDouble("Enter measured length (inches): ");
	
			dimensionalLumber.setThickness(thickness);
			dimensionalLumber.setWidth(width);
			dimensionalLumber.setLength(length);
	
			System.out.println(dimensionalLumber);
			System.out.print(lumberChecker.validate(dimensionalLumber));   
			System.out.println("Program by Karamjot");
			
			continue_program = user.inputString("continue(yes/no)?").toLowerCase();               // taking input and converting to lower case
		
			if(continue_program.equals("no")) {
				run = false;                          // setting the value of while condition false
			}
		}
		System.out.println("Program will now shut down.");
	}
}