import java.io.*;

import javax.swing.JOptionPane;
public class MainDoctor {

	public static void main(String[] args) {
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		//Storing the number of input in the array
		Doctor arrDoctor[] = new Doctor[2];
		
		for (int i = 0; i<arrDoctor.length; i++) {
			String input2 = JOptionPane.showInputDialog(null, "Enter doctor's name: ");
			String input3 = JOptionPane.showInputDialog(null, "Enter department: ");
			String input4 = JOptionPane.showInputDialog(null, "Enter salary (RM): ");
			double salary = Double.parseDouble(input4);
	
			//Asking input types from user
			String input5 = JOptionPane.showInputDialog(null, "Enter \n(1 = Houseman)\n(2 = Consultant)");
			int type = Integer.parseInt(input5);
			
			if (type == 1) {
				String input6 = JOptionPane.showInputDialog(null, "Supervising doctor name: ");
				String input7 = JOptionPane.showInputDialog(null,"Number of oncalls: ");
				int oncall = Integer.parseInt(input7);
				
				arrDoctor[i] = new Houseman(input2, input3, salary, input6, oncall);
			}
			else if (type == 2) {
				String input8 = JOptionPane.showInputDialog(null,"Number of oncalls: ");
				int oncall2 = Integer.parseInt(input8);
				
				arrDoctor[i] = new Consultant(input2, input3, salary, oncall2);
			}
		}
		
		//Display the name of doctors with their extra pay amount
		for (int i = 0; i < arrDoctor.length; i++) {
			JOptionPane.showMessageDialog(null, "--- NAME OF DOCTORS AND EXTRA AMOUNT ---" + "\nName: " + arrDoctor[i].getName()
										  + "\nExtra pay: RM" + arrDoctor[i].calXtraPay());
		}
		
		//Display the name of all house man supervised by Dr Daniel Iqram
		for (int i = 0; i < arrDoctor.length; i++) {
			if (arrDoctor[i] instanceof Houseman) {
				Houseman h = (Houseman) arrDoctor[i];
				if (h.getSupervisingDr().equalsIgnoreCase("Dr Daniel Iqram")) {
					JOptionPane.showMessageDialog(null, "Names supervised by Dr Daniel Iqram:" 
							+ "\n" + h.getName());
				}
			}
		}	
		
		//Display the name of all consultants in the Pediatrics department
		for (int i = 0; i < arrDoctor.length; i++) {	
			if (arrDoctor[i] instanceof Consultant) {
				Consultant c = (Consultant) arrDoctor[i];
				if (c.getDepartment().equalsIgnoreCase("Pediatrics")) {
					JOptionPane.showMessageDialog(null, "Names under Pediatrics department:"
											  + "\n" + c.getName());
				}
			}
		}	
		
		//Calculate and display the total amount the hospital paid to all Doctors
		double totalSalary = 0.0;
		for (int i = 0; i < arrDoctor.length; i++) {
			totalSalary = totalSalary + arrDoctor[i].getSalary();
		}
		JOptionPane.showMessageDialog(null, "The hospital pays RM " + totalSalary + " to all its doctors.");
		System.exit(0);
	}
}
