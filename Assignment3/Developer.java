package Assignment3;

public class Developer extends Employee {
		Developer(int a,String b){
			this.empId=a;
			this.empName=b;
		}
	public double SalCal(int a) {
		this.empSalary=a*1.3;
		return this.empSalary;
	}
	public static void main(String[]arg) {
	Developer e1=new Developer(200,"ammu");
		e1.SalCal(20000);
		e1.display();

	}
	}



