
public class MyDate {
	//attributes
	private int month;
	private int day;
	private int year;
	
	//Constructors
	public MyDate(){
		this.month=3;
		this.day=16;
		this.year=2015;
	}
	public MyDate(int month,int day,int year){
		this.month=month;
		this.day=day;
		this.year=year;
	}
	
	//Accessors
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	public int getYear(){
		return this.year;
	}
	public String getDate(){
		StringBuilder date = new StringBuilder();
		date.append(this.month);
		date.append("/");
		date.append(this.day);
		date.append("/");
		date.append(this.year);
		return date.toString();
	}
	
	//Mutators
	public void setMonth(int newMonth){
		if(newMonth < 12 && newMonth > 0){
			this.month = newMonth;
		}
	}
	public void setDay(int newDay){
		if(newDay <32 && newDay > 0){
			this.day = newDay;
		}
	}
	public void sedYear(int newYear){
		this.year=newYear;
	}

}
