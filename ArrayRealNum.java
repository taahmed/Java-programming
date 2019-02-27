
import java.util.Arrays; 

public class ArrayRealNum {
	public static void main(String[] args) {
		// creating two lists of Array decimal numbers
		double[] list1 = { 16.1, 12.3, 22.2, 14.4 }; 
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };

		// create boolean(true or false) and called the first list1 in result
		boolean result = isSorted(list1);
		System.out.println(result); // print out the result

		// create boolean(true or false) and called the second in list2 in result1
		boolean result1 = isSorted(list2);
		System.out.println(result1);
	}
	// create boolean method that hold one parameter and search for if is sorted if not
	// return false
	public static boolean isSorted(double[] list) {
		if (list.length == 1)
			return true;
		else {
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					return false;
				}
			}
		}
		return true; 
	}
}