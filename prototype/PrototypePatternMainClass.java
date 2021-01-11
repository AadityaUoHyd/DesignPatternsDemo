//client (leant from "Code Decode" youtube)

package designPattern.prototype;

public class PrototypePatternMainClass {

	public static void main(String[] args) {
		
		ProfessionCache.loadProfessionCache();
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession);
		
		Profession tecProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(tecProfession);
		
		Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession2);
		
	}
	
}
