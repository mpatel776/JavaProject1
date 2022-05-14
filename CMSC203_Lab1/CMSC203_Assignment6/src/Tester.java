import java.util.Random;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
//		Order order = new Order (8, DAY.MONDAY, new Customer ("Mary", 22));
//		Tester tester = new Tester();
		int ramnum = Tester.getRandomNumber(10000,90000);
		System.out.println(ramnum);
		ramnum = Tester.getRandomNumber(10000,90000);
		System.out.println(ramnum);
		ramnum = Tester.getRandomNumber(10000,90000);
		System.out.println(ramnum);
	}

	
	public static int getRandomNumber(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}



}
