package designPattern.abstractFactoryPattern;

//This is Factory of Factory, gives u factory instance which will in turn give u required class object.
public class AbstractFactoryProducer {
	
	public static AbstractFactory getProfession(boolean isTrainee) {
		if(isTrainee) {
			return new TraineeProfessionAbstractFactory();
		}
		else {
			return new ProfessionAbstractFactory();
		}
	}

}