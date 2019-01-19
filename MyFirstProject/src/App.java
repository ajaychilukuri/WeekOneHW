
public class App {

	public static void main(String[] args) {
		//Item price 
		double xPrice = 10.99;
		double yPrice = 20.99;
		//Amount of money in wallet
		double xWallet = 100.50;
		double yWallet = 21.99;
		//Number of friends
		int xFriends = 40;
		int yFriends = 21;
		//Age in years
		int xAge = 20;
		int yAge = 21;
		//First name
		String xFirst = "Steven";
		String yFirst = "John";
		//Last name
		String xLast = "Smith";
		String yLast = "Doe";
		//Middle initial
		char xInitial = 'A';
		char yInitial = 'B';
		//New amount of money in wallet after buying an item
		double xMoney = (xWallet - xPrice);
		double yMoney = (yWallet - yPrice);
		//Number of friends made each year 
		int xNewFriends = xFriends / xAge;
		int yNewFriends = yFriends / yAge;
		//Full name
		String xFullName = xFirst + " " + xInitial + "." + " " + xLast;
		String yFullName = yFirst + " " + yInitial + "." + " " + yLast;
		
		//Money in wallet after buying the item
		System.out.println(xFirst + " " + "has" + " " + "$" + xMoney + " " + "after buying toothpaste.");
		System.out.println(yFirst + " " + "has" + " " + "$" + yMoney + " " + "after buying 4 avocados.");
		//Number of friends made each year based on age variable and number of friends variable
		System.out.println("I made" + " " + xNewFriends + " " + "new friends each year I was alive.");
		System.out.println("I made" + " " + yNewFriends + " " + "new friend each year I was alive.");
		//Full name
		System.out.println("My name is" + " " + xFullName + ".");
		System.out.println("My name is" + " " + yFullName + ".");

	}

}
