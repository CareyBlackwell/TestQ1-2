
public class Student extends Person{
	private final String cStatus;
	
	//no-arg Constructor
	public Student(){
		super();
		this.cStatus="Freshman";
	}
	//Constructor with args
	public Student(String fName, String lName, String adress, String phoneNumber, String email, String cStatus){
		super(fName,lName,adress,phoneNumber,email);
		this.cStatus=cStatus;
	}
	
	//public accessors
	public String getCStatus(){
		return cStatus;
	}
	
	//toString override- returns the Class name and instance attribute first and last name
		@Override
		public String toString(){
			StringBuilder des = new StringBuilder();
			des.append("This student's name is ");
			des.append(this.getFName());
			des.append(" ");
			des.append(this.getLName());
			return des.toString();
		}
}
