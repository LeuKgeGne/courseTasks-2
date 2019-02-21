import java.util.Random;

public class Assignment_1 {
	
	public static void main(String[] args) {
		Random number = new Random();
		int head = 0, tail = 0, amount = 1000, counter = 0;
		do {
			if(number.nextBoolean())
			{
				head++;
			}
			else
			{
				tail++;
			}
			counter++;
		} while(counter < amount);
		System.out.printf("Head = %d\nTail = %d", head, tail);
	}

}
