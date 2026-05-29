class Employee{
	void display(){
		System.out.println(" ...");
	}
}
class Name extends Employee{
	void name(){
		System.out.println("Hema");
	}
}
class Salary extends Name{
	void salary(){
		System.out.println("two lakhs");
	}
}
class Role extends Salary{
	void role(){
		System.out.println("Manager");
	}
}
class Main{
	public static void main(String[] args){
		Role m1=new Role();
		m1.display();
		m1.name();
		m1.salary();
		m1.role();
	}
}
		