public class Consultant extends Doctor{
	
	int noOfPatients;
	
	//Default constructor
	public Consultant() {
		super();
		noOfPatients = 0;
	}
	
	//Normal constructor
	public Consultant(String n, String d, double s, int p) {
		super(n, d, s);
		noOfPatients = p;
	}
	
	//Getter
	public int getNoOfPatients() {
		return noOfPatients;
	}
	
	//Calculate extra pay
	public double calXtraPay() {
		return super.getSalary() + (500 * noOfPatients);
	}
	
	//Display
	public String Printer() {
		return ("\n" + super.toString() + "\nTOTAL EXTRAPAY: RM" + calXtraPay());
	}

}
