package Assignment3;

public class Employee {
	 int empId;
	 String empName;
	  double empSalary ;
	Employee(){}
Employee(int a ,String b){
	this.empId=a;
	this.empName=b;
}
public double SalCal(int a)	{
	this.empSalary=a;
	return this.empSalary;
}
public void display() {
	System.out.println("Emp Id :"+empId);
	System.out.println("Emp name :"+empName);
	System.out.println("Emp salary :"+empSalary);
	System.out.println();
}
public static void main(String[]arg) {
	Employee e1=new Employee(200,"salina");
	e1.SalCal(20000);
	e1.display();

}
}
