package AddressGroup;

public class Entry {
	//fields
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	
	//creating constructors
	//method that you call when you want to make a new instance of a thing
	public Entry() {
		this("", "", "", "");
	}
	
	//overloaded constructor 
	public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}
	
	
	//getter and setter method of these main fields above
	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override //<--(annotation)n overriding the "to String" method
	public String toString() {
		return "Entry [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + "]";
	}
	
	
  
  
 
}
