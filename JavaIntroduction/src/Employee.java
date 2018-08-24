
public class Employee {

	private int empID;
	private double salary;
	private String empname;
	private String companyName;
	
	public Employee() {
		empID=10;
		empname="city";
		salary=1000;
		companyName="city LTD";
	}
	 public Employee(int empID, String empname, double salary) {
		 this();
		 this.empID=empID;
		 this.empname=empname;
		 this.salary=salary;
	 }
	 public void display() {
System.out.println(empname+"\t"+empID+"\t"+companyName+"\t"+salary);
	 }
	 public static void main(String []args) {
		 Employee emp= new Employee(1200,"emp name1",12000d);
		 emp.display();
	 }
}
