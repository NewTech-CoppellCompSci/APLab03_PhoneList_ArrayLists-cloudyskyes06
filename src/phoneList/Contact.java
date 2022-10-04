package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {
	
	//parameters
	private String name;
	private String phoneNum;
	
	
	
	//constructor
	public Contact(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		
	}
	
	//default constructor
	public Contact() {
		name = "No Name";
		phoneNum  = "No Number";
	}
	
	public Contact(String name) {
		this.name = name;
		this.phoneNum = "No Number";
	}
	
	
	//getter methods
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phoneNum;
	}
	
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	//override
	@Override
	public String toString() {
		return "Name: " + name
		 	 + "Phone Number: " + phoneNum;
		 	 
	}
	
}

