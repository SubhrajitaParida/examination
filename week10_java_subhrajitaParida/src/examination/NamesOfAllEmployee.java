//Q.List down the names of all employees in each department?

package examination;

import java.util.List;
import java.util.stream.Collectors;

public class NamesOfAllEmployee {
public static void main(String[] args) {
	List<Employee> employees=AddingElements.addingToList();
	employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).
	entrySet().forEach(element->{System.out.println("=============="+element.getKey()+"==============");
	element.getValue().stream().forEach(e->{
		System.out.println(e.getName());
	});
	});
}
}
