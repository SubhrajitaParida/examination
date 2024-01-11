//Q.Get the youngest employee details each department wise (By Using Optional)?

package examination;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetYoungestEmployee {
public static void main(String[] args) {
	List<Employee> employees=AddingElements.addingToList();
	employees.sort((element1,element2)->element1.getAge()-element2.getAge());
    employees.stream().
			collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
			forEach(element->{
				System.out.println("==============="+element.getKey()+"================");
				System.out.println(element.getValue());
			});
	
}
}
