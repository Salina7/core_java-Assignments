package Assignment2;

public class Tshirt {
		String color;
		String material;
		String design;
		String brand;
		//constructor
		Tshirt()
		{
		}
		//Parameterized constructor
		Tshirt(String color,String material,String design)
		{
			this.color=color;
			this.material=material;
			this.design=design;
		}
		Tshirt(String color,String material,String design,String brand)
		{
			this.color=color;
			this.material=material;
			this.design=design;
			this.brand=brand;
		}
		//display method for displaying details
		public void display( String size)
		{
			System.out.println(color);
			System.out.println(material);
			System.out.println(design);
			System.out.println(size);
		}
		public static void main(String args[])
		{
			Tshirt s=new Tshirt();//object
			s.color="black";
			s.material="cotton";
			s.design="trend";
			s.display("small");
			//System.out.println(s.differentSize("small"));
			Tshirt s1=new Tshirt("blue","silk","oldfashion");//object
			//calling display method
			s1.display("large");
			//System.out.println(s1.differentSize("large"));
			Tshirt s2=new Tshirt("white","Reyon","newfashion");//object
			//calling display method
			s2.display("X-large");
			//System.out.println(s2.differentSize("x-large"));
			
		}
		

	
}
