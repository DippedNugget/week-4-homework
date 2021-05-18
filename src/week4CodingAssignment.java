import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4CodingAssignment {

	/*
	 * Question 1
	 */
	
	static List<String> employeeNames = new ArrayList<String>();
	
	/*
	 * Question 2
	 */

	static Set<Integer> ids = new HashSet<Integer>();
	
	/*
	 * Question 3
	 */
	
	static Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		
		/*
		 * Question 4
		 */
		
		ids.add(123);
		ids.add(456);
		ids.add(789);
		ids.add(1011);
		ids.add(1213);
		
		//test print
		// for (int id : ids) {
		// 	System.out.println(id);
		// }
		
		employeeNames.add("Adam");
		employeeNames.add("Leah");
		employeeNames.add("Anna");
		employeeNames.add("Bern");
		employeeNames.add("Derek");
		
		//test print
		// for (String employee : employeeNames) {
		// 		System.out.println(employee);
		// }
		
		/*
		 * Question 5
		 */
		int i = 0;
		
		for (Integer id : ids) {
			employeeMap.put(id , employeeNames.get(i));
			i++;
		} 
		//System.out.println(employeeMap); //test print
		
		/*
		 * Question 6
		 */
		
		Set<Integer> mapKeys = employeeMap.keySet();
		for (Integer key : mapKeys) {
			System.out.println(key + " : " + employeeMap.get(key));
		}
		
		System.out.println(" ");
		
		/*
		 *  Question 7 through 9 
		 */
		
		StringBuilder idBuilder = new StringBuilder();
		for (Integer key : mapKeys) {
			idBuilder.append(key + "-");
		}
		
		System.out.println(idBuilder.toString());
		
		System.out.println(" ");
		
		/*
		 *  Question 10 through 12
		 */
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		} 
		
		System.out.println(namesBuilder.toString());
		
		
	}
	

}
