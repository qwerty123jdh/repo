import com.pojo.Employee;

public class DemoMyClass {
	
	public static void main(String[] args) {
		EmployeeIO empIO= new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return new Employee();
			}
			
			@Override
	       public void display() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};
		Employee emp= empIO.readEmployee();
		empIO.writeEmployee(emp); 
	}

}
