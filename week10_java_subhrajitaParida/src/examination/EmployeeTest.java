package examination;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
    @Test
	public void test() {
		EmployeeExist employeeExist=new EmployeeExist();
	   boolean employee=employeeExist.existOrNot();
		assertEquals(employee, employee);
	}
}
