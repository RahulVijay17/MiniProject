package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Email em1 = new Email("Rahul","Vijay");
		System.out.println(em1.showInfo());
		em1.setAlternateEmail("rv@gmail.com");

	}

}
