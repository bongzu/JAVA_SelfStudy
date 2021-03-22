import java.util.Scanner;
public class Greatest_Common_Divisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[This is Greatest Common Divisor Program]");
		System.out.print("\nType two integer plz >>");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		if(number1 < number2) 
		{
			int change = 0;
			change = number1;
			number1 = number2;
			number2 = change;
			
			System.out.println("\nSecond number is bigger than First number");
			System.out.println("Swapping result: "+number1+" , "+number2);
		}
			
		while(true)
		{
		 int remainder = number1 % number2;
		 
		 if(remainder == 0)
		 {
			 break;
		 }
		 else
		 {
			 number2 = number1;
			 number1 = remainder;
		 }
		}
		
	
		System.out.println("\nCongratuation!");
		System.out.println("The GCD is "+number2+"!!");
	}

}
