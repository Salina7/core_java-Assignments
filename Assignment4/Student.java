package Assignment4;
public class Student {
	private int id;
	    private String name;
	    private double marks;
	 
	  Student(String name, double marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	 
	    String getname() {
	        return this.name;
	    }
	 
	    void setTitle(String name) {
	        this.name = name;
	    }
	 
	    double  getmarks() {
	        return this.marks;
	    }
	 
	    void setmarks(float marks) {
	        this.marks = marks;
	    }

	    public String toString() {
	        return this.name + "-" + this.marks;
		}
	 

}
