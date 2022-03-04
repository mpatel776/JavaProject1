/*
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: The purpose of this class is to model a Television
 * 
 * Due: 25/2/2022
 * 
 * Platform/Compiler: Eclipse(Java Compiler)
 * 
 * I pledge that I have completed the programming assignment independently
 * I have not copied my code from a student or any source 
 * I have not given my code to any student
 * @author Meet Patel
 * 
*/
public class Television {
	//specifies the manufacturer
	private String MANUFACTURER = "";
	//stores the screen size of the TV
	private int SCREEN_SIZE = 0;
	//stores the state of the Television
	private boolean powerOn;
	//stores the current station
	private int channel;
	//stores the value of volume in the television
	private int volume;
	
	//Intialize the fields each time on instance of class is created
	public Television(String brand,int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	/**
	 * this method returns the current manufacturer. It takes no argument
	 * @return MANUFACTURER the string manufacturer 
	 * */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * sets the manufacturer brand. It takes one String argument
	 * 
	 * @param manufacturer String that represents the manufacturer brand
	 * */
	public void setManufacturer(String manufacturer) {
		MANUFACTURER = manufacturer;
	}
	
	/**
	 * fetches the manufacturer brand. It takes no argument
	 * @return SCREEN_SIZE integer value representing the screen size
	 * */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/**
	 * sets the screen size. It takes one argument of type int
	 * @param screensize integer value representing the screen size
	 * */
	public void setScreenSize(int screenSize) {
		SCREEN_SIZE = screenSize;
	}
	
	/**
	 * fetches the current channel. It takes no argument
	 * @return channel the current channel of type int
	 * */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * sets the channel to desired value. It takes one argument of type int
	 * @param channel integer value representing the channel number
	 * */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * fetches the current volume. It takes no argument
	 *@return volume integer value representing the current volume
	 * */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * decrements volume by 1. It takes no argument
	 * */
	public void decreaseVolume() {
		this.volume = this.volume - 1;
	}
	
	/**
	 * increments the volume by 1. It takes no argument
	 * */
	public void increaseVolume() {
		this.volume = this.volume + 1;
	}
	
	/**
	 * It toggles the TV between on or off(true or false). It takes no argument
	 * */
	public void power() {
		this.powerOn = !this.powerOn;
	}
	
	
}
