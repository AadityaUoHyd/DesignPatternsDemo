package designPattern.Singleton;

public class PrinterUtil extends CommonUtils {

	private static final long serialVersionUID = 1L;

	private static PrinterUtil instance;
	
	@SuppressWarnings("unused")
	private static boolean isInstantiated = false;
	
	/* static{
	      instance = new PrinterUtil();
	 }
	  */
	
	private PrinterUtil() throws InstantiationException {
		/*if(isInstantiated == true) {
			throw new InstantiationException();
		}
		else {
			isInstantiated=true;
		}*/
		System.out.println("PrinterUtil: 0 param constructor.");
	}
	
	public static PrinterUtil getInstance() {
		try{
			//if(instance==null) {
				synchronized (PrinterUtil.class) {
					if(instance == null) {
						instance = new PrinterUtil();
					}
					
				}
		//	}   //Synchronized
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	public Object readResolve() {
		System.out.println("PrinterUtil:readResolve()");
		return instance;
	}
	
	/*public static PrinterUtil getInstance(){
	      return instance; 
	 }*/
}
