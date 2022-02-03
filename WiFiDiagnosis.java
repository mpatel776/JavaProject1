package wifiDiagnosis;

import java.util.Scanner;

/*
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This the Class That Acts As The Driver-Class that
 * brings together all the class into a single point of entry to
 * the program. It brings together all the components.
 * 
 * Due: 4/2/2022
 * 
 * Platform/Compiler: Eclipse(Java Compiler)
 * 
 * I pledge that I have completed the programming assignment independently
 * I have not copied my code from a student or any source 
 * I have not given my code to any student
 * Meet Patel
 * 
*/



public class WiFiDiagnosis {
	private boolean isFixed = false;
	private boolean isValidInput = false;
	private Scanner prompt = new Scanner(System.in);
	
	
	public static void main(String[] Args) {
		//Display the Purpose of the Program
		System.out.println("This Program is Wi-Fi Diagnostic Tool That Is Meant to Help in Troubleshooting Internet Connectivity Issues \n");
		//create an instance of the diagnostics class
		WiFiDiagnosis  diagnosis = new WiFiDiagnosis();
		//As long as the instance variable isFixed is false run the loop
		while(diagnosis.isFixed() == false) {
			//run rebootComputer method
			do{
				diagnosis.rebootComputer();
			}while(diagnosis.isValidInput == false);
			
			if(diagnosis.isFixed() == false) {
				//run rebootRouter method
				do{
					diagnosis.rebootRouter();
				}while(diagnosis.isValidInput == false);
			}
			if(diagnosis.isFixed() == false) {
				//run confirmConnectingCablesAndPower method
				do{
					diagnosis.confirmConnectingCablesAndPower();
				}while(diagnosis.isValidInput == false);
			}
			if(diagnosis.isFixed() == false) {
				//run moveComputer method
				do{
					diagnosis.moveComputer();
				}while(diagnosis.isValidInput == false);
			}
			if(diagnosis.isFixed() == false && diagnosis.isValidInput == true) {
				//run contactISP method
				do{
					diagnosis.contactISP();
				}while(diagnosis.isValidInput == false);
			}
		}
		System.out.println("Wi-Fi Diagnostics Completed");
	}
	
	/**
	 * @return the isFixed
	 */
	public boolean isFixed() {
		return isFixed;
	}
	
	
	/**
	 * @param isFixed the isFixed to set
	 */
	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}
	
	//isProblemFixed to ask for feedback from the user
	public void isProblemFixed() {
		//variable to store user input
		String answer;
		//display to The User The Instruction
		System.out.println("Did that Fix The Problem?(yes/no) \n");
		//prompt user
		answer = prompt.next();
		//if problem is fixed instance variable isFixed to true else set to false
		if(answer.equalsIgnoreCase("yes")) {
			setFixed(true);
			setValidInput(true);
		}else if("no".equalsIgnoreCase(answer)) {
			setFixed(false);
			setValidInput(true);
		}else {
			setValidInput(false);
			setFixed(false);
			System.out.println("Invalid Input Try Again. \n");
		}
	}
	
	public void rebootComputer() {
		System.out.println("First Step: Reboot the Computer and Try Reconnecting\n");
		isProblemFixed();
		if(isFixed()) {
			System.out.println("Rebboting Computer Fixed The Issue\n");
		}
	}
	
	public void rebootRouter() {
		//display to the user the instruction
		System.out.println("Second Step: Reboot Your Router and Try Reconnecting\n");
		//Ask for feedback
		isProblemFixed();
		if(isFixed()) {
			System.out.println("Rebooting The Router Fixed The Issue\n");
		}
	}
	
	public void confirmConnectingCablesAndPower() {
		//display to the user the instruction
		System.out.println("Third Step: Make sure the cables connecting the router are firmly plugged in and the power is getting to the router\n");
		//Ask for feedback
		isProblemFixed();
		if(isFixed()) {
			System.out.println("It Seems It was A Cabling Issue\n");
		}
	}
	
	
	public void moveComputer() {
		//display to the user the instruction
		System.out.println("Fourth Step: Move The Computer Closer to the Router and Try Reconnecting\n");
		//Ask for feedback
		isProblemFixed();
		if(isFixed()) {
			System.out.println("It seems Moving The Computer Closer Fixed The Issue\n");
			setFixed(true);
		}
	}
	
	
	public void contactISP() {
		//Initialize variable to store the answer
		String answer;
		//display to the user the instruction
		System.out.println("Fifth Step: Contact Your ISP and make Sure that the Router is connected to the ISP\n");
		//Ask for feedback
		isProblemFixed();
		//If the problem is not fixed yet ask whether to restart the diagnostics, if no the program exits withs status 0
		if(isFixed() == false) {
			System.out.println("Would you like to Run This Diagnostics Again?(yes/no)");
			answer = prompt.next();
			if(answer.equalsIgnoreCase("no")) {
				System.out.println("Wi-Fi Diagnostics Completed");
				System.exit(0);
			}else {
				setValidInput(false);
			}
		}
	}

	/**
	 * @param isValidInput the isValidInput to set
	 */
	public void setValidInput(boolean isValidInput) {
		this.isValidInput = isValidInput;
	}
}
