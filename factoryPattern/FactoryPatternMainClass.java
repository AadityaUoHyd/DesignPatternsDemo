//Client class or main class from where we want to use Factory.

package designPattern.factoryPattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession profession = professionFactory.getProfession("Doctor"); //Whatever you ask(Doctor/Teacher/Engineer), you'll get.
		profession.print();
		
	}
	
}

/*
 
In Factory Pattern we don't expose the object creation logic to the client & refer the created object using a standard interface.
Factory Design pattern is also known as, "Virtual Constructor". 
 
Steps:
	1. create a main class which will call factory class.
	2. Factory class returns required class instance.

Application Areas of Factory pattern:
     1. When class can't anticipate the class of object it must create.
     2. When class want to abstract the object creation process.
     3. Where you've to create an object of any one of sub-classes or possible classes depending on the data provided.
     
     e.g. Connection con = DriverManager.getConnection(X, Y, Z);   //Type1 or Type4 JDBC driver depends upon 'X' value.

*/