package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class EmployeeDb {
	
public static List<Employee> getEmpDetails(){
	 List<Employee> empDetails = new ArrayList<>();
	IntStream.range(1, 1000).forEach(i->{
		empDetails.add(new Employee(i, "Employee "+i, Integer.valueOf(new Random().nextInt(10*100))));
	});
	return empDetails;
	}

}
