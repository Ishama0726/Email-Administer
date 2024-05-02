package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		//Email has two constructor that take two strings.
		Email em1 = new Email ("Ishama","Payoe");
		
		//Function call showInfor
		System.out.println (em1.showInfo());
		
		//em1.setalternateEmail("js@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		
	}

}
