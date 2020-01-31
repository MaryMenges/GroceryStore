import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		try (
		Scanner in = new Scanner(System.in)) {
			System.out.println("How much have you spent today?");
			in.nextDouble();
		}
		
		int amountSpent = 0;
		if (amountSpent < 10) {
			//NO DISCOUNT
		} else if (amountSpent <= 60) {
			 //0.08 DISCOUNT
		} else if (amountSpent <= 150) {
			//0.1 DISCOUNT
		} else if (amountSpent <= 210) {
			//0.12 DISCOUNT
		} else if (amountSpent >= 210.01) {
			//0.14 DISCOUNT
	
			
		 }
		}
		
			
		
	}

