package Assignment3;

public  abstract class Employee2 {
	private int empid;
	 private String empname;
	private double empbasicpay;
	 private String address;
	 private int numberofleaves;
	 public Employee2(int id , String name , double basicpay, String address, int numberofleaves) {
		 this.empid=id;
		 this.empname=name;
		 this.empbasicpay=basicpay;
		 this.address=address;
		 this.numberofleaves=numberofleaves;
	 }

	
}