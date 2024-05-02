package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String Password;
	private String department;
	private String email;
	private int mailboxCapacity= 500;
	private int defaultpasswordLength = 10;
	private String alternateEmail;
	private String compantSuffix = "aeycompany.com";
	
	//Constructor to receive the first name and last name
			public Email (String firstName, String lastName) {
				this.firstName= firstName;
				this.lastName = lastName;
			System.out.println("Email created "+ this. firstName + " " + this.lastName);
			
	//Call a method asking for the department - return the department
			this.department = SetDepartment();
			//System.out.println("Department: "+ this.department);
			
			
	// Call a method that return a random password
			this.Password = randomPassword(defaultpasswordLength);
			//System.out.println("Your Password is:" + this.Password);
			
			
	// Combine elements to generate email
			email = firstName.toLowerCase() + "." +lastName.toLowerCase()+"@"+department + "." + compantSuffix;
			//System.out.println("Your email is: " + email);
			}
	//For the Department
			private String SetDepartment() {
				System.out.println(" Department Codes \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Depatment Code:");
				Scanner in = new Scanner (System .in);
				int depChoice = in.nextInt();
				if (depChoice == 1) {return "sales";}
				else if (depChoice ==2) {return "Development";}
				else if (depChoice ==3) {return "Accounting";}
				else {return"";}
			}
	
	//Generate the random Password
	         private String randomPassword (int length) {
	        	 	 String PasswordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"; 
	        	 	 char[] password = new char [length];
	        	 	 for (int i=0 ;i<length;i++) {
	        	 		int rand =(int)(Math.random()*PasswordSet.length());
	        	 		  password[i] = PasswordSet.charAt(rand);
	        	 	 }
	        	 	 return new String(password);
	         }
	//Set the mailbox Capacity
	public void setMailInboxCapacity (int capacity) {
		this.mailboxCapacity =capacity; //Current object value passed as the  parameter to the method. 
	}
	//Set the alternate Email
	
	public void setalternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//Change the Password
	public void changePassword(String password) {
		this.Password =password;
	}
	
	public int getMaliboxCapacity() {return mailboxCapacity ;}
	public String getAlternateEmail() {return alternateEmail ;}
	public String getPassword () {return Password ;}
	
	
	public String showInfo() {
		return "Display Name :"+firstName +""+ lastName +
			   "\nCompany Email :"+ email +
			   "\nMailBox Capacity :" + mailboxCapacity +"mb";
				}
}
