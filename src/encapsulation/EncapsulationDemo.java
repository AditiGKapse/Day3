package encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {

		OopsConceptDemo obj= new OopsConceptDemo();
		
		obj.setName("aditi");
		obj.setAge(21);
		obj.setSerilaNum(1001);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerilaNum());
		
		System.out.println(obj);
		
		
	}

}
