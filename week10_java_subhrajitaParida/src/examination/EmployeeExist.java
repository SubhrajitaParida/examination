package examination;

import java.util.List;
import java.util.Optional;

public class EmployeeExist {

	public boolean existOrNot() {
		List<Employee> employees=AddingElements.addingToList();
	Optional<Employee> optional=employees.stream().filter(element->element.getName().contains("Suresh")).
			findFirst();
	if(optional.isPresent()) {
		return true;
	}
	else {
		return false;
	}
		
	}
}
