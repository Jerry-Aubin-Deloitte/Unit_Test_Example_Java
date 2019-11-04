package UnitTestExample;

/**
 * Example class against which one can run unit tests
 * @author jaubin
 *
 */
public class ExampleClass {
	/**
	 * Adds together two integers
	 * @param int1 The first integer
	 * @param int2 The second integer
	 * @return The sum
	 */
	public static int addIntegers(int int1, int int2) {
		return int1 + int2;
	}
	
	/**
	 * A qualitative assessment of a quantitative temperature measurement
	 * @param degreesF The temperature in fahrenheit
	 * @return What the temperature is like
	 */
	public static String getTemperatureLevel(int degreesF) {
		if (degreesF <= 60)
			return "Cold";
		else if (degreesF >= 85) {
			return "Hot";
		}
		else
			return "Pleasant";
	}
	
	/**
	 * Determines whether or not the student passes the class
	 * @param grade The student's grade
	 * @param numAbsences The number of absences the student had
	 * @return Whether or not they passed
	 */
	public static boolean didStudentPassClass(double grade, int numAbsences) {
		return grade >= 60 && numAbsences < 3;
	}
	
	/**
	 * Postpends "[out of stock]" when item is out of stock
	 * @param name The item name
	 * @param quantity The quantity in stock
	 * @return The processed item name
	 */
	public static String processItemName(String name, int quantity) {
		if (quantity == 0)
			name = name + " [out of stock]";
		return name;
	}
}
