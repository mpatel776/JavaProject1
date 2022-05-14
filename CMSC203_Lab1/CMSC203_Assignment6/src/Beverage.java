import java.util.Objects;

/**
 * Class: CMSC203
 * 
 * Instructor: Gary Thai
 * 
 * Description: This class models a beverage drink
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

public abstract class Beverage {
	private String name;
	private SIZE size;
	private TYPE type;
	private final double BASE_PRICE = 2.0;
	private final double MEDIUM_PRICE = 3.0;
	private final double LARGE_PRICE = 4.0;
	
	public double getMEDIUM_PRICE() {
		return MEDIUM_PRICE;
	}

	public double getLARGE_PRICE() {
		return LARGE_PRICE;
	}

	public Beverage(String name, SIZE size, TYPE type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}
	
	public abstract double calcPrice();

	public String getBevName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SIZE getSize() {
		return size;
	}

	public void setSize(SIZE size) {
		this.size = size;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	
	@Override
	public String toString() {
		return "name: " + name + ", size: " + size;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Beverage other = (Beverage) obj;
		return Objects.equals(name, other.name) && size == other.size && type == other.type;
	}
	
}
