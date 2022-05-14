/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models Coffee beverage
 * 
 * Due: 13/05/2022
 * 
 * Platform/Compiler: Eclipse(Java Compiler)
 * 
 * I pledge that I have completed the programming assignment independently
 * I have not copied my code from a student or any source 
 * I have not given my code to any student
 * @author Meet Patel
 * 
**/

public class Coffee extends Beverage {
	private boolean extra_coffee;
	private boolean extra_syrup;
	private final double EXTRA_COFFEE_PRICE = 0.5;
	private final double EXTRA_SYRUP_PRICE = 0.5;


	public Coffee(String name, SIZE size, boolean extra_coffee, boolean extra_syrup) {
		super(name, size, TYPE.COFFEE);
		this.extra_coffee = extra_coffee;
		this.extra_syrup = extra_syrup;
	}

	@Override
	public double calcPrice() {
		double price = super.getBasePrice();
		if(super.getSize() == SIZE.MEDIUM) {
			price = super.getMEDIUM_PRICE();
		}else if(super.getSize() == SIZE.LARGE) {
			price = super.getLARGE_PRICE();
		}
		if(extra_coffee) {
			price += EXTRA_COFFEE_PRICE;
		}
		if(extra_syrup) {
			price += EXTRA_SYRUP_PRICE;
		}
		
		return price;
	}

	@Override
	public String toString() {
		return "extra_coffee: " + extra_coffee + ", extra_syrup: " + extra_syrup + ", Price: " + calcPrice()
				+ ", Name: " + getBevName() + ", Size: " + getSize() ;
	}

	@Override
	public boolean equals(Object obj) {
		Coffee other = (Coffee) obj;
		return super.equals(obj) &&  extra_coffee == other.getExtraShot() && extra_syrup == other.getExtraSyrup();
	}

	public boolean getExtraShot() {
		return extra_coffee;
	}

	public void setExtra_coffee(boolean extra_coffee) {
		this.extra_coffee = extra_coffee;
	}

	public boolean getExtraSyrup() {
		return extra_syrup;
	}

	public void setExtra_syrup(boolean extra_syrup) {
		this.extra_syrup = extra_syrup;
	}
}
