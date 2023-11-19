package isprime;
import java.util.Scanner;

public class Is_Prime {
	
	public static void main(String[]args) {
	Scanner main = new Scanner(System.in);
	
	int number = 0;
	
	System.out.print("Input a number: ");
	number = main.nextInt();
	
	if(Is_Prime(number))
	{
		System.out.println(number +" is prime.");
	}
	else
	{
		System.out.println(number +" is not prime.");
	}
}
	
public static boolean Is_Prime(int number)
	{
	if(number<=1)
	{
		return false;
	}
	for (int i=2; i<number/2 ; i++)
	{
		if (number % i==0)
		{
			return false;
		}
	}
	return true;
	}
}