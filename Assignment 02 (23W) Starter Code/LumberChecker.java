/*
 * Student Name: Karamjot
 * Lab Professor: Professor David Haley
 * Due Date: March 31, 2023
 * Description: Assignment 02 (23W) Sample Solution - Update of original concept
 *              by Professor Stanley Pieda
 */

/*
 * This class provide the details about lumber by comparing with it typical marketing lumber,
 * which is 2x6x16. It checks if the lumber is within the certain limits, which is 0.03125 and
 * give the result according to it.
 */
public class LumberChecker {
	
	public static final double EPSILON = 0.03125;     //   fixed amount set for comparison 0.03125, which is 1/32 one-thirty-second inch
	
	/*
	 * validate(DimensionalLumber lumber) is a working method of a class LumberChecker which return the String type result.
	 * firstly it checks if there are no negative values in the instance of object lumber.
	 * if there is no negative it continues otherwise it returns a statement
	 * After that it checks if there are any values in length, width and thickness exceeds epsilon values. if there is it will return at that point with 
	 * a statement stating that lumber exceeds the tolerance value.
	 * if all statements are false means lumber meets the requirement for minimum tolerance and will return with a statement which 
	 */
	public String validate(DimensionalLumber lumber) {
		
		double thickness = lumber.getThickness();
		double width = lumber.getWidth();
		double length = lumber.getLength();
		String report = "";
		double thicknessDifference = Math.abs(thickness - DimensionalLumber.EXPECTED_THICKNESS);  // getting the difference and making it absolute
		double widthDifference = Math.abs(width - DimensionalLumber.EXPECTED_WIDTH);             // getting the difference and making it absolute
		double lengthDifference = Math.abs(length - DimensionalLumber.EXPECTED_LENGTH);         // getting the difference and making it absolute
		
		if( thickness <0 || width < 0 || length < 0 ) {       // check that there is no negative value
			report = "Negative dimension entered, lumber cannot be verified.\n";
		}else if(thicknessDifference > EPSILON || widthDifference > EPSILON || lengthDifference > EPSILON){      // check if differences are greater than epsilon
			report = report + "Lumber dimensions are not within tolerance.\n";
			if(thicknessDifference > EPSILON ) {        // check that the thickness does not differ more than EPSILON and 1.5 inches
				report = report +("Thickness exceeds tolerance of 0.03125 inches.\n");
			}if(widthDifference > EPSILON) {           // check that the width does not differ more than EPSILON and 5.5 inches
				report = report + ("Width exceeds tolerance of 0.03125 inches.\n");
			}if(lengthDifference > EPSILON) {          // check that the length does not differ more than EPSILON and 192 inches
				report = report + ("Length exceeds tolerance of 0.03125 inches.\n");
			}
		}else {                                     //if if/else's condition dosen't apply then do this
			report = "Lumber dimensions meet tolerance standards of 0.03125 inches.\n";
		}
		return report;
	}
}
