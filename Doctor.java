public abstract class Doctor {
	
	String name;
	String department;
	double monthlySalary;
	
	//Default constructor
	public Doctor() {
		name = "Not available";
		department = "Not available";
		monthlySalary = 0.0;
	}
	
	//Normal constructor
	public Doctor(String n, String d, double s) {
		name = n;
		department = d;
		monthlySalary = s;
	}
	
	//Setter
	public void setDoctor(String data1, String data2, double data3) {
		name = data1;
		department = data2;
		monthlySalary = data3;
	}
	
	//Getter
	public String getName(){
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return monthlySalary;
	}
	
	//Display
	public String Printer() {
		return ("NAME: " + name + "\nDEPARTMENT: " + department 
				+ "\nMONTHLY SALARY: RM" + monthlySalary);
	}
	
	public abstract double calXtraPay();
}
