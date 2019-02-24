public class CheckNumber 
{
	public static boolean isPalindrom(int value) 
	{
		int rev = 0;
		int i = 0;
		int originalNum = value;

		while (value != 0) 
		{
			rev = value % 10;
			i = i * 10 + rev;
			value = value / 10;
		}
		return originalNum == i ? true : false;
	}

	
	public static boolean isPrime(int value)
	{       
		int counter = 2;
       		if (value == 1) return false;
        	while (counter <= Math.sqrt(value))
		{
           		if (value % counter == 0)
			{
               		 return false;
            		}
            		counter++;
        	}
		return true;
	}
	
	
	public static boolean isNaturalNumber(int value)
	{
		return value > 0;
	}	
	
	
	public static int getTheBiggestDigit(int value)
	{
		int maxDigit = 0, changer = value;
		while (maxDigit != 9 && changer != 0) 
		{
			if (maxDigit < (changer % 10)) 
			{
				maxDigit = changer % 10;
			}
			changer /= 10;
		}
		return maxDigit;
	}
	
	
	public static int gcd(int a, int b) 
	{
		while (a != b)
		{
			int c = a > b ? (a -= b) : (b -= a);
		}
		return a;
	}
	
	
	public static int lcm(int a, int b)
	{
		return a / gcd(a, b) * b;
	}
	
	
	public static int sumOfSomeDividers(int value)
	{	
	    int sum = 0, counter = 1;
	    do 
	    {
	    	sum+=((value % counter == 0) ? counter : 0);
	    	counter++;
	    } while(counter < value/2+1);
		return sum;
	}
	
    public static int sumDividers(int value)
    {
		int sum = 1;
		for (int i = 2; i < Math.sqrt(value) + 1; i++) 
		{
			if (value % i == 0) {
				sum += i + value / i;
			}
		}
		return sum;
}
	
	public static int amountOfDifferentDigits(int value)
	{
		int amount = 0;
		boolean flag;
		
		for (int i = 0; i < 10; i++)
		{
			flag = false;
			int localValue = value;
			
			do {
				if ((localValue % 10) == i) 
				{
					amount++;
					flag = true;
				}
				
				localValue /= 10;
			} while((localValue > 0) && (!flag));
		}
		return amount;
	}
	
	public static void simpleDividers(int value)
	{
		if (isPrime(value)) 
		{
			System.out.printf("The number = %d is primitive\n", value);
		} 
		else 
		{
			System.out.printf("The number = %d:\n", value);
			
			for (int counter = 1; counter < value / 2 + 1; counter++) 
			{
				if ((value % counter == 0) && isPrime(counter)) 
				{
					System.out.println(counter);
				}
			}
		}
	}
}
