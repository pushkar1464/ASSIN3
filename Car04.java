

import java.util.Scanner;

class Vehicle{
	float milage;
	int Price;
}

class Car extends Vehicle {
	int OwnershipCost;
	int Warrenty;
	int SeatingCap;
	String FuelType;
	
	void Display() {
		System.out.println("Milage - "+milage);
		System.out.println("Price - "+Price);
		System.out.println("OwnershipCost - "+ OwnershipCost);
		System.out.println("Warrenty - " + Warrenty);
		System.out.println("SeatingCap - " +SeatingCap);
		System.out.println("FuelType" +FuelType);
	}
}

class Bike extends Vehicle{
	int cylinder;
	int gear;
	String CoolingType;
	String WheelType;
	int TankSize;

	void Display() {
		System.out.println("Milage - "+milage);
		System.out.println("Price - "+Price);
		System.out.println("Cylinder - "+ cylinder);
		System.out.println("Gear - " + gear);
		System.out.println("Cooling Type - " +CoolingType);
		System.out.println("WheelType - " +WheelType);
	}
}

class Audi extends Car {
	String ModelType;
	void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Milage - " );
		float milage = sc.nextInt();
		System.out.println("Enter a Price" );
		int Price = sc.nextInt();
		System.out.println("Enter a OwnershipCost" );
		int OwnershipCost = sc.nextInt();
		System.out.println("Enter a Warrenty - " );
		int Warrenty = sc.nextInt();
		System.out.println("Enter a SeatingCap - " );
		int SeatingCap = sc.nextInt();
		System.out.println("Enter a FuelType" );
		String FuelType = sc.next();
		System.out.println("Enter a ModelType - " );
		String ModelType = sc.next();
		
		this.milage = milage;
		this.Price = Price;
		this.OwnershipCost=OwnershipCost;
		this.Warrenty=Warrenty;
		this.SeatingCap=SeatingCap;
		this.FuelType=FuelType;
		this.ModelType=ModelType;
		
		super.Display();
	}

	
}
class Ford extends Car {
	String ModelType;
	void add(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Milage - " );
		float milage = sc.nextInt();
		System.out.println("Enter a Price" );
		int Price = sc.nextInt();
		System.out.println("Enter a OwnershipCost" );
		int OwnershipCost = sc.nextInt();
		System.out.println("Enter a Warrenty - " );
		int Warrenty = sc.nextInt();
		System.out.println("Enter a SeatingCap - " );
		int SeatingCap = sc.nextInt();
		System.out.println("Enter a FuelType" );
		String FuelType = sc.next();
		System.out.println("Enter a ModelType - " );
		String ModelType = sc.next();
		
		this.milage = milage;
		this.Price = Price;
		this.OwnershipCost=OwnershipCost;
		this.Warrenty=Warrenty;
		this.SeatingCap=SeatingCap;
		this.FuelType=FuelType;
		this.ModelType=ModelType;
		
		super.Display();
	}
}
class TVS extends Bike {

	String MakeType;

	void add(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Milage - " );
		float milage = sc.nextInt();
		System.out.println("Enter a Price" );
		int Price = sc.nextInt();
		System.out.println("Enter a No Cylinder - " );
		int cylinder = sc.nextInt();
		System.out.println("Enter a No Gear- " );
		int gear = sc.nextInt();
		System.out.println("Enter a Colling Type - " );
		String CoolingType = sc.next();
		System.out.println("Enter a WheelType" );
		String WheelType = sc.next();
		System.out.println("Enter a TankSize - " );
		int TankSize = sc.nextInt();
		System.out.println("Enter a Make Type - ");
		String MakeType = sc.next();
		
		this.milage = milage;
		this.Price = Price;
		this.cylinder=cylinder;
		this.gear=gear;
		this.CoolingType=CoolingType;
		this.WheelType=WheelType;
		this.TankSize=TankSize;
		this.MakeType=MakeType;

		super.Display();
	}
}
class Bajaj extends Bike {
	String MakeType;
	void add(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Milage - " );
		float milage = sc.nextInt();
		System.out.println("Enter a Price" );
		int Price = sc.nextInt();
		System.out.println("Enter a No Cylinder - " );
		int cylinder = sc.nextInt();
		System.out.println("Enter a No Gear- " );
		int gear = sc.nextInt();
		System.out.println("Enter a Colling Type - " );
		String CoolingType = sc.next();
		System.out.println("Enter a WheelType" );
		String WheelType = sc.next();
		System.out.println("Enter a TankSize - " );
		int TankSize = sc.nextInt();
		System.out.println("Enter a Make Type - ");
		String MakeType = sc.next();
		
		this.milage = milage;
		this.Price = Price;
		this.cylinder=cylinder;
		this.gear=gear;
		this.CoolingType=CoolingType;
		this.WheelType=WheelType;
		this.TankSize=TankSize;
		this.MakeType=MakeType;

		super.Display();
	}
}

public class Car04 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Details of - "+ "1.Audi "+" 2.Ford "+" 3.TVS "+" 4.Bajaj ");
		System.out.println("Enter a Choice - ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			Audi A = new Audi(); 
			A.add();
//			A.Display();
			break;
		case 2:
			Ford F = new Ford();
			F.add();
//			F.Display();
			break;
		case 3:
			TVS T = new TVS();
			T.add();
//			T.Display();
			break;
		case 4 :
			Bajaj B = new Bajaj();
			B.add();
//			B.Display();
			break;
		}
	}
}