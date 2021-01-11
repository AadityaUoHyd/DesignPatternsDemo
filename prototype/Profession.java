package designPattern.prototype;

public abstract class Profession implements Cloneable {

	public int id;
	public String name;
	
	abstract void print();
	
	public Object cloningMethod() {
		Object cloneObject = null;
		
		try {
			cloneObject = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cloneObject;
	}
	
}
