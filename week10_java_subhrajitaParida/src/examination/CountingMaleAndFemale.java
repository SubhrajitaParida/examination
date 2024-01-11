//Q.How many male and female employees are there in the organization?

package examination;

import java.util.List;
import java.util.stream.Collectors;

public class CountingMaleAndFemale {
public static void main(String[] args) {
	List<Employee> employees=AddingElements.addingToList();
	employees.stream().
	collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).
	entrySet().forEach(element->System.out.println(element.getKey()+"="+element.getValue()));
}
}
