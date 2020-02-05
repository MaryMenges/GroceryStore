import java.util.Scanner;
public class Project {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		


		


	

	int exitLoop = 1;
	while (exitLoop == 1)
	{
		System.out.println("How much have you spent today?");
		if (in.hasNextDouble())
		{

			double amountSpent = in.nextDouble();
			if (amountSpent == 0) 
			{
				exitLoop = 0;
			}
			double percentDiscount = 0;
			
			if (amountSpent < 10 || amountSpent > 1000)
			
			{
				//NO DISCOUNT

			} 
			else if (amountSpent <= 60)
			{
				percentDiscount = 0.08;
			} 
			else if (amountSpent <= 150)
			{
				percentDiscount = 0.1;
			} 
			else if (amountSpent <= 210)
			{
				percentDiscount = 0.12;
			} 
			else if (amountSpent >= 210.01)
			{
				percentDiscount = 0.14;
			}
			double moneyOff = amountSpent * percentDiscount;
			System.out.printf("You win a discount coupon of $%.2f", moneyOff);
			System.out.println();
		}
		else 
		{
			System.out.println(in.next()+ " is not a valid input");
		}
	}










}



}

