package MyOwnAutoShopProject;

public class MyShop {
	int Speed;
	double regularPrice;
	String color;
	int year;
	int manufacturerDiscount;
	double getSalePrice;
	
 public static void main(String[] args) {
	 Sedan mySedan = new Sedan(80, 20000, "Red", 10);
	 Ford myFord = new Ford (100,4452.0,"Black",2005, 10);
	 Car myCar = new Car (160, 56856.0, "White"); 
	 System.out.printf("MySedan Price %.2f", mySedan.getSalePrice());
	 System.out.printf("MyFord Price %.2f", myFord.getSalePrice());
	 System.out.printf("MyCar Price %.2f", myCar.getSalePrice());
	 }
	}


