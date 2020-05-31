import java.util.Scanner;
public class StarbucksDemo {
	public static void main(String[] args) {

		StarbucksAccount joesAccount = new StarbucksAccount("Joe", "King", "98765432", 10.0);
		StarabucksAccount jbondAccount = new StarbucksAccount("James", "Bond", "007", 7.0);

      //Test your code here with the above object and some of your own!
      
      
      
 // joesAccount.generateUsername();
//      joesAccount.earnedReward();
//      joesAccount.makePurchase(5.0);
//      
      Scanner keyboard= new Scanner(System.in);
      
      
        System.out.println("Please enter your option:");
        
		System.out.println("\t1. Print Account Info");
		System.out.println("\t2. Generate Username");
		System.out.println("\t3. Deposit Funds");
		System.out.println("\t4. Make Purchase");
		
		int userInput = keyboard.nextInt();
		if (userInput > 4) {
			System.out.println("Please enter an option between 1-5.");
			
		}
		else {
			if(userInput == 1)
			{
				jbondAccount.printAccountInfo();
			}
			else if (userInput == 2)
			{
				System.out.println(jbondAccount.generateUsername());
				
			}
			else if (userInput == 3)
			{
				int depositInput = keyboard.nextInt();
				jbondAccount.addFunds(depositInput);
				System.out.println(jbondAccount.getFunds());
			}
			else if (userInput == 3)
			{
				int costInput = keyboard.nextInt();
				double cost = (double) costInput;
				jbondAccount.makePurchase(cost);
				System.out.println(jbondAccount.getFunds());
			}
			else {
				System.out.println("Please enter an option between 1-4.");
			}
		}
	}
}