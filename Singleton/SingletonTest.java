package designPattern.Singleton;

public class SingletonTest {

	public static void main(String[] args) throws Exception{
		
		//Create two reference variable of PrinterUtil class to test whether they are pointing to one object?
		PrinterUtil pu1 = null;
		PrinterUtil pu2 = null;
		
		//Initiate object creation.
		pu1 = PrinterUtil.getInstance();
		pu2 = PrinterUtil.getInstance();
		
		System.out.println(pu1.hashCode()+" "+pu2.hashCode());
		System.out.println("pu1 and pu2 are referring same object? "+(pu1==pu2));
	}
	
}