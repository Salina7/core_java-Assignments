package Assignment4;


public class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() { }
	Employee(int id, String name, double salary )  
    {  
         this.empId=id;  
         this.empName=name;  
         this.empSalary=salary;  
    }  
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public static void main(String args[])  
    {  
        Employee e=new Employee(111,"Shalu",50000);  
        Employee e1=new Employee(112,"Sandy",25000);  
        // both will print Employee.toString()  
        System.out.println(e);  
        System.out.println(e1);  
	
}
	public int getempid() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}