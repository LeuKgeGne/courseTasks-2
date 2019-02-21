import java.util.Scanner;

public class Assignment_3 {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println(((CheckNumber.sumOfSomeDividers(number) == number) ? 
				"it's perfect" : "it's not perfect"));
	}
}