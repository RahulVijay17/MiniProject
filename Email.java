package EmailApp;

import java.util.Scanner;

public class Email {
 	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity =500;
	private int defaultPasswordLength= 10;
	private String alternateEmail;
	private String companySuffix= "xyzcompany.com";
	 
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	//	System.out.println("Created Email:" + this.firstName + " "+this.lastName);
		
		this.department = setDepartment();
	//	System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	//	System.out.println("your emailid is "+email);
	}
	
	private String setDepartment() {
	
		System.out.println("New Worker: " + firstName+"\nDepartment Code \n1 for sales\n2 for Development \n3 for Accounting \n0 none \n Enter the Department Code");
		Scanner sc = new Scanner(System.in);
		int deptChoice= sc.nextInt();
		if(deptChoice==1) {
			return "sales";
		}
		else if(deptChoice==2) {
			return "development";
		}
		else if(deptChoice==3) {
			return "accounting";
		}
		else {
			return  "";
		}
	}		
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&";
		char[] password= new char[length];
		for (int i=0; i<length;i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String showInfo()
	{
		return "DISPLAY NAME: " + firstName + " "+lastName +
		       "\nCOMPANY MAIL: " + email +
		       "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	

}