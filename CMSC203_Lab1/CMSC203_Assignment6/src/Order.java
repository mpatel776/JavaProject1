import java.util.ArrayList;
import java.util.Random;

/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models Order maade the Beverage shop
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

public class Order implements OrderInterface, Comparable<Object> {
	private int order_number;
	private int order_time;
	private DAY day;
	private Customer customer;
	private ArrayList<Beverage> beverages = new ArrayList<Beverage>();

	public Order(int order_time, DAY day, Customer customer) {
		this.order_time = order_time;
		this.day = day;
		this.customer = customer;
		this.order_number = this.getRandomNumber();
	}

	public int getRandomNumber() {
		int min = 10000;
		int max = 90000;
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public int getOrderNo() {
		return this.order_number;
	}

	public void setOrderNo(int order_number) {
		this.order_number = order_number;
	}

	public int getOrderTime() {
		return order_time;
	}

	public void setOrderTime(int order_time) {
		this.order_time = order_time;
	}

	public DAY getOrderDay() {
		return day;
	}

	public void setDay(DAY day) {
		this.day = day;
	}

	public Customer getCustomer() {
		Customer customer = new Customer(this.customer);
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}

	@Override
	public boolean isWeekend() {
		if(this.getOrderDay() == DAY.SATURDAY || this.getOrderDay() == DAY.SUNDAY) {
			return true;
		}
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		return this.getBeverages().get(itemNo);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extra_coffee, boolean extra_syrup) {
		Beverage beverage = new  Coffee(bevName,size, extra_coffee,extra_syrup);
		beverages.add(beverage);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size) {
		Beverage beverage = new Alcohol(bevName,size,this.isWeekend());
		beverages.add(beverage);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		Beverage beverage = new Smoothie(bevName,size,numOfFruits,addPRotien);
		beverages.add(beverage);
	}

	@Override
	public double calcOrderTotal() {
		double total = 0;
		for(Beverage beverage: beverages) {
			total += beverage.calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		int total = 0;
		for(Beverage beverage: beverages) {
			if(beverage.getType() == type) {
				total++;
			}
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "Order number: " + order_number + ", order time: " + order_time + ", day: " + day + ", customer: "
				+ customer + ", beverages:" + beverages + ", Order Total:" + calcOrderTotal();
	}

	@Override
	public int compareTo(Object obj) {
		Order other = (Order) obj;
		if(this.order_number > other.getOrderNo()) {
			return 1;
		}else if(this.order_number < other.getOrderNo()) {
			return -1;
		}	
		return 0;
	}

	public int getTotalItems() {
		if(this.beverages == null) {
			return 0;
		}else {
			return beverages.size();
		}
	}

}
