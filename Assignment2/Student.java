package Assignment2;


public class Student {
	int stdId;
	String stdName, stdClass;
	// default constructor
	Student(){}
	//parameterized constructor
	Student(int Id ,String Name,  String Class){
			this.stdId=Id;
			this.stdName=Name;
			this.stdClass=Class;
		}
			
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);	
	}
	

	public static void main(String[]arg) {
		Student s1=new Student(123,"shalu","four");
		s1.display();
		
		Student s2=new Student(456,"sanju","five");
		s2.display();
		 
}

}



