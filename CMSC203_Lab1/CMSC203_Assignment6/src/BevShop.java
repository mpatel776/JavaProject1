import java.util.ArrayList;

/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models a beverage shop and the various operations that occur in the shop
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

public class BevShop implements BevShopInterfce {
	private int number_of_alcoholic_drinks;
	private ArrayList<Order> order_list = new ArrayList<Order>();
	private Order current_order;
	
	@Override
	public boolean validTime(int time) {
		if(time >= MIN_TIME && time <= MAX_TIME ) {
			return true;
		}
		return false;
	}

	@Override
	public boolean eligibleForMore() {
		if(this.number_of_alcoholic_drinks >= MAX_ORDER_FOR_ALCOHOL) {
			return false;
		}
		return true;
	}

	@Override
	public boolean validAge(int age) {
		if(age > MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		Customer newCustomer = new Customer(customerName,customerAge);
		this.current_order = new Order(time,day,newCustomer);
		this.order_list.add(current_order);
	}

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		this.getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
//		this.order_list.add(current_order);
	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		this.getCurrentOrder().addNewBeverage(bevName, size);
//		this.order_list.add(current_order);
	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		this.getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtien);
//		this.order_list.add(current_order);
	}

	@Override
	public int findOrder(int orderNo) {
		int index = -1;
		for(int i = 0;i< this.order_list.size();i++) {
			if(this.order_list.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return index;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		int orderIndex = this.findOrder(orderNo);
		return this.order_list.get(orderIndex).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() {
		double total = 0;
		for(Order order: this.order_list) {
			total += order.calcOrderTotal();
		}
		return total;
	}

	@Override
	public void sortOrders() {
		for(int i = 0;i< this.order_list.size()-1;i++) {
			int min_index = i;
			for(int j= i+1;j< this.order_list.size();j++) {
				if(this.order_list.get(j).getOrderNo()<this.order_list.get(min_index).getOrderNo()) {
					min_index = j;
				}
			}
			
			Order temp = this.order_list.get(min_index);
			this.order_list.set(min_index, this.order_list.get(i));
			this.order_list.set(i, temp);
			
		}

	}

	@Override
	public Order getOrderAtIndex(int index) {
		return this.order_list.get(index);
	}

	public Order getCurrentOrder() {
		return this.current_order;
	}
	
	public void setCurrentOrder(Order order) {
		this.current_order = order;
	}

	public int getNumOfAlcoholDrink() {
		int numberOfDrinks = 0;
		for(Beverage beverage: this.current_order.getBeverages()) {
			if(beverage.getType() == TYPE.ALCOHOL) {
				numberOfDrinks++;
			}
			
		}
		return numberOfDrinks;
	}

	public int totalNumOfMonthlyOrders() {
		return this.order_list.size();
	}

	public boolean isMaxFruit(int i) {
		if(i> MAX_FRUIT) {
			return true;
		}
		return false;
	}

	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}

	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	@Override
	public String toString() {
		return "BevShop [order_list=" + order_list + ", Total Monthly Sale()=" + totalMonthlySale() + "]";
	}

}
