import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your number: ");
		number = scanner.nextInt();
		
		if(CheckNumber.isNaturalNumber(number))
		{
			System.out.printf("The biggest natural digit is: %d\n", 
					CheckNumber.getTheBiggestDigit(number));
			
			System.out.println(CheckNumber.isPalindrom(number)? 
					"Number is Palindrom!" : "Number is not Palindrom!");
			
			System.out.println(CheckNumber.isPrime(number)? 
					"Number is primitive!" : "Number is not primitive!");	
			
			System.out.printf("Amount of different digits: %d\n", 
					CheckNumber.amountOfDifferentDigits(number));
			
			System.out.println("The number's simple dividers:");
			CheckNumber.simpleDividers(number);
		}
		else 
		{
			System.out.println("The number is not Natural!");
		}
		
		int a, b;
		System.out.print("Number first: ");
		a = scanner.nextInt();
		System.out.print("Number second: ");
		b = scanner.nextInt();

		if (CheckNumber.isNaturalNumber(a) && CheckNumber.isNaturalNumber(b)) 
		{
			System.out.printf("The numbers a = %d, b = %d:\n" + "GSD is: %d\nLCM is: %d\n", 
					a, b, CheckNumber.gcd(a, b), CheckNumber.lcm(a, b));
		}	
		else 
		{
			System.out.println("Wrong input!");
		}
		
		scanner.close();
	}

}