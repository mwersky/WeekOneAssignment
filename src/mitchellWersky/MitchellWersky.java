package mitchellWersky;

public class MitchellWersky {

	public MitchellWersky() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("	Part One: Variables");
			//For Organization
		String breakLn = "_________";
		System.out.println(breakLn);
		
			//Item Price
		int newPC = 799;
		int newPlaystation = 399;
		System.out.println("New PC: " + newPC);
		System.out.println("New PS5: " + newPlaystation);
		System.out.println(breakLn);
		
			//Amount of Money in Wallet
		int tipDay = 319;
		int noTipDay = 470;
		System.out.println("Tip Day (in $): " + tipDay);
		System.out.println("Normal Check (in $): " + noTipDay);
		System.out.println(breakLn);
		
		
			//# of Friends
		int myFacebookIGuess = 270;
		System.out.println("My Friends List: " + myFacebookIGuess);
		System.out.println(breakLn);
		
		
			//Age in Years
		int myRealAge = 26;
		int myFakeAge = 62;
		System.out.println("My Real Age: " + myRealAge);
		System.out.println("My Age Backwards: " + myFakeAge);
		System.out.println(breakLn);
		
		
			//First NAme
		String myName = "Mitchell";
		String myBrotherName = "Cole";
		System.out.println("My Name is " + myName);
		System.out.println( "My Brothers Name is " + myBrotherName);
		System.out.println(breakLn);
		
			//Last Name
		String myLastName = "Wersky";
		String momLastName = "Hacker";
		System.out.println("My last name is " + myLastName);
		System.out.println("My Mothers maiden name is " + momLastName);	
		System.out.println(breakLn);
		
			//Middle Initial
		char myInitial = 'J';
		char momInitial = 'M';
		System.out.println("My middle initial is " + myInitial);
		System.out.println("My Mothers middle initial is " + momInitial);
		System.out.println(breakLn);
		
	System.out.println("	Part Two: Operations");
	System.out.println(" ");
		
		//New Amount of money in wallet after buying the Item
		int brokeWallet = noTipDay - newPlaystation;
		System.out.println("My paycheck minus a new Playstation (in $): " + brokeWallet);
		System.out.println(breakLn);
		
		//Number of friends you've made each ear based on your age variable and your number of friends variable
		int friendsPerYear = myFacebookIGuess / myRealAge;
		System.out.println("Friends per year on average :" + friendsPerYear);
		System.out.println(breakLn);
		
		//Full Name based on first name, middle initial, and last name.
		System.out.println("My Full name is: " + myName + " " + myInitial + " " + myLastName);
		System.out.println(breakLn);
	}

}
