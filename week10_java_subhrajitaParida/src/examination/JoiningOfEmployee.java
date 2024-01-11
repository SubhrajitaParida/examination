//Q.Get the names of all employees who have joined after 2015?

package examination;

import java.util.List;

public class JoiningOfEmployee {
public static void main(String[] args) {
	List<Employee> employees=AddingElements.addingToList();
	employees.stream().filter(element->element.getYearOfJoining()>2015).
	forEach(System.out::println);
}
}
