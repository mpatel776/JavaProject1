/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models a Smoothie Beverage Drink
 * 
 * Due: 13/5/2022
 * 
 * Platform/Compiler: Eclipse(Java Compiler)
 * 
 * I pledge that I have completed the programming assignment independently
 * I have not copied my code from a student or any source 
 * I have not given my code to any student
 * @author Meet Patel
 * 
**/


public class Smoothie extends Beverage {
	private int number_of_fruits;
	private boolean protein_powder;
	private final double PRICE_PER_FRUIT = 0.5;


	public Smoothie(String name, SIZE size, int number_of_fruits, boolean protein_powder) {
		super(name, size, TYPE.SMOOTHIE);
		this.number_of_fruits = number_of_fruits;
		this.protein_powder = protein_powder;
	}

	
	public double getPRICE_PER_FRUIT() {
		return PRICE_PER_FRUIT;
	}
	
	public int getNumOfFruits() {
		return number_of_fruits;
	}


	public void setNumber_of_fruits(int number_of_fruits) {
		this.number_of_fruits = number_of_fruits;
	}


	public boolean getAddProtein() {
		return protein_powder;
	}


	public void setProtein_powder(boolean protein_powder) {
		this.protein_powder = protein_powder;
	}


	@Override
	public double calcPrice() {
		double price = super.getBasePrice();
		if(super.getSize() == SIZE.MEDIUM) {
			price = super.getMEDIUM_PRICE();
		}else if(super.getSize() == SIZE.LARGE) {
			price = super.getLARGE_PRICE();
		}
		if(protein_powder) {
			price += 1.5;
		}
		
		price += this.getNumOfFruits() * this.getPRICE_PER_FRUIT()  ;
		return price;
	}


	@Override
	public String toString() {
		return "Number of fruits :" + number_of_fruits + ", Add protein powder :" + protein_powder
				+ ", Price :" + calcPrice() + ", Name:" + getBevName() + ", Size :" + getSize();
	}
	
	@Override
	public boolean equals(Object obj) {
		Smoothie other = (Smoothie) obj;
		return super.equals(obj) &&  number_of_fruits == other.getNumOfFruits() && protein_powder == other.getAddProtein();
	}

}
