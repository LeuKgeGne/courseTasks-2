import java.util.*;

public class Assignment_4 
{
	public static void main(String[] args) 
	{
		int firstNumber, secondNumber;
		boolean flag = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		firstNumber = scanner.nextInt();
		System.out.print("Enter first number: ");
		secondNumber = scanner.nextInt();

		if (CheckNumber.isNaturalNumber(firstNumber) && CheckNumber.isNaturalNumber(secondNumber)) 
		{
			for (int i = firstNumber; i < secondNumber + 1 && flag; i++) 
			{
				int j = CheckNumber.sumDividers(i);
				if ((CheckNumber.sumDividers(j) == i) && ((CheckNumber.sumDividers(i)) != i)) 
				{
					System.out.printf("First number: %d\nSecond number: %d\nThey are friendly", i, j);
					flag = false;
				}
			}
		} 
		else 
		{
			System.out.println("Wrong input!");

		}

		scanner.close();
	}
}
