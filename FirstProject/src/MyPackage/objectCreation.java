package MyPackage;

public class objectCreation {
	
	
	

	public static void main(String[] args) {
		student cherishma= new student(); //here cherishma is a object or instance
		
		cherishma.setId(5);
		cherishma.setName("cherishma");
		cherishma.setAge(21);
		
		System.out.println(cherishma.getName()+ "'s age is " +cherishma.getAge());
		
	}

}
