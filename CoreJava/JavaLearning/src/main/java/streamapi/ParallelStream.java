package streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		
		IntStream.range(1, 100).forEach(i->{
			System.out.print(i+" ");
		});
		
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution : "+(end-start));
		
		start = System.currentTimeMillis();
		
		IntStream.range(1, 100).parallel().forEach(i->{
			System.out.print(i+" ");
		});
		
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution for parallel: "+(end-start));
		
		System.out.print("+============threads for parallel and normal=================+");
		
		IntStream.range(1, 10).forEach(i->{
			System.out.println("Thread : "+Thread.currentThread().getName());
		});
		
		IntStream.range(1, 10).parallel().forEach(i->{
			System.out.println("Thread parallel: "+Thread.currentThread().getName());
		});
		
		System.out.println("+=====================================+");
		
		List<Employee> employees = EmployeeDb.getEmpDetails();
		
		start = System.currentTimeMillis();
		double normalSt = employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		System.out.println(normalSt);
		end = System.currentTimeMillis();
		System.out.println("Time took for execution employee: "+(end-start));
		
		start = System.currentTimeMillis();
		double parallelSt = employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		System.out.println(parallelSt);
		end = System.currentTimeMillis();
		System.out.println("Time took for execution for parallel employee: "+(end-start));
	}
	
	

}
