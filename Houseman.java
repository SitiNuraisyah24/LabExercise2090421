public class Houseman extends Doctor{

	String supervisingDr;
	int noOfOncalls;
	
	//Default constructor
	public Houseman() {
		super();							//Calling the superclass
		supervisingDr = "Not available";
		noOfOncalls = 0;
	}
	
	//Normal constructor
	public Houseman(String n, String d, double s, String sdr, int o) {
		super(n, d, s);
		supervisingDr = sdr;
		noOfOncalls = o;
	}
	
	//Getter
	public String getSupervisingDr() {
		return supervisingDr;
	}
	
	public int getNoOfOncalls() {
		return noOfOncalls;
	}
	
	//Calculate extra pay
	public double calXtraPay() {
		return super.getSalary() + (100 * noOfOncalls);
	}
	
	//Display
	public String Printer() {
		return ("\n" + super.toString() + "\nNO. OF ONCALLS: " + noOfOncalls
				+ "\nTOTAL EXTRAPAY: RM" + calXtraPay());
	}
}
