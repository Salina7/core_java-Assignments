package Assignment3;

public abstract class Area {
	    public static void main(String[] args)
	    {
	        Shape shape;
	        
	        // assign subclass reference to subclass variable
	        Rectangle rect = new Rectangle();
	        shape = rect;
	        // Set data in Rectangle's object 
	        shape.setValues(50, 5);
	        //Display the area of rectangle
	        System.out.println("Area of rectangle : " + shape.getArea());
   Square squ = new Square();
	        shape = squ; 
	        shape.setValues(80, 5);
	        //Display the area of square
	        System.out.println("Area of square : " + shape.getArea());
	        Triangle tri = new Triangle();       
	        shape = tri;
	        // Set data in Triangle's object         
	        shape.setValues(25,3);
	        //Display the area of triangle        
	        System.out.println("Area of triangle : " + shape.getArea());
	    }
	}

	
