//Q.Number of male and female employees are there in the sales and marketing department?

package examination;

import java.util.List;
import java.util.stream.Collectors;

public class MaleAndFemalePresent {
public static void main(String[] args) {
	List<Employee> employees=AddingElements.addingToList();
	employees.stream().filter(element->element.getDepartment().equals("Sales") || 
			element.getDepartment().equals("Marketing")).collect(Collectors.
			groupingBy(Employee::getGender,Collectors.counting())).entrySet().
	        forEach(element->System.out.println(element.getKey()+"="+element.getValue()));
}
}
