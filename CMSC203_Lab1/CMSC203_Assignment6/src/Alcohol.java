/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models alcohol beverage
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


public class Alcohol extends Beverage {
	private boolean weekend;
	private final double WEEKEND_ADDITIONAL_COST = 0.6;

	public Alcohol(String name, SIZE size, boolean weekend) {
		super(name, size, TYPE.ALCOHOL);
		this.weekend = weekend;
	}
	
	public double getWEEKEND_ADDITIONAL_COST() {
		return WEEKEND_ADDITIONAL_COST;
	}

	@Override
	public double calcPrice() {
		double price = super.getBasePrice();
		if(super.getSize() == SIZE.MEDIUM) {
			price = super.getMEDIUM_PRICE();
		}else if(super.getSize() == SIZE.LARGE) {
			price = super.getLARGE_PRICE();
		}
		if(this.weekend) {
			price += WEEKEND_ADDITIONAL_COST;
		}
		return price;
	}

	
	@Override
	public String toString() {
		return "weekend : " + weekend + ", Price : " + calcPrice() + ", Name :" + getBevName()
				+ ", Size : " + getSize();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Alcohol other = (Alcohol) obj;
		return super.equals(obj) &&  weekend == other.isWeekend();
	}

	public boolean isWeekend() {
		return weekend;
	}

	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}	

}
