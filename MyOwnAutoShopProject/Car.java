package MyOwnAutoShopProject;


public class Car {
	int speed;
	double regularPrice;
	String color;
	Car(){}
	Car(int speed,double regularPrice,String color)
	{
this.speed=speed;
this.regularPrice=regularPrice;
this.color=color;		
}
	public double getSalePrice() {
		return regularPrice;
	}
	public void display() {
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
	}
public static void main(String[]arg) {
	Car c1=new Car(80,2000,"white");
	c1.display();
	System.out.println(c1.getSalePrice());
}
}