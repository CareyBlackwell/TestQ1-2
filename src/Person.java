
public abstract class Person {
	//attributes
	private String fName;
	private String lName;
	private String adress;
	private String phoneNumber;
	private String email;
	
	//No-arg Constructor
	public Person(){
	}
	//Constructor with arguments
	public Person(String fName, String lName, String adress, String phoneNumber, String email){
		this.fName=fName;
		this.lName=lName;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	//public accessors
	public String getFName(){
		return this.fName;
	}
	public String getLName(){
		return this.lName;
	}
	public String getAdress(){
		return this.adress;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public String getEmail(){
		return this.email;
	}
	
	//public modifiers
	public void setFName(String FirstName){
		this.fName = FirstName;
	}
	public void setLName(String LastName){
		this.lName=LastName;
	}
	public void setAdress(String newAdress){
		this.adress = newAdress;
	}
	public void setPhoneNumber(String newNumber){
		this.phoneNumber = newNumber;
	}
	public void setEmail(String newEmail){
		this.email = newEmail;
	}
	
}
