class Vehicle{
	void faredetails(){
		System.out.println("Vehicle fare details:");
	}
}
class Car extends Vehicle{
	void faredetails(){
		System.out.print("Car");
		System.out.println("\nDistance:"+"20 km");
		System.out.println("cost:"+500);
	}
}
class Bike extends Vehicle{
	void faredetails(){
		System.out.print("Bike");
		System.out.println("\nDistance:"+" 30 km");
		System.out.println("cost:"+200);
	}
}
class Auto extends Vehicle{
	void faredetails(){
		System.out.print(" Auto");
		System.out.println("\nDistance:"+"50 km");
		System.out.println("cost:"+300);
	}
}
class Booking{
	public static void main(String[] args){
		Vehicle v;
        System.out.print("Books an ");
        v = new Auto();
        v.faredetails();
        System.out.println();
        System.out.print("Books a ");
        v = new Car();
        v.faredetails();
        System.out.println();
        System.out.print("Books a ");
        v = new Bike();
        v.faredetails();
	}
}
