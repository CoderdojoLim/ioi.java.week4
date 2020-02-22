import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class CalculateAverageExample
{
	public static void main(String[] args)
	{
		System.out.println("Take a number of inputs and calculate the average.");

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you have to input?");
		int totalNumberInputs = sc.nextInt();
		double averageOfInputs, sumOfInputs = 0;
		for(int input = 1; input <= totalNumberInputs; input = input + 1)
		{
			System.out.println("Please input number " + input);
			int number = sc.nextInt();
			sumOfInputs = sumOfInputs + number;
		}
		averageOfInputs = sumOfInputs / totalNumberInputs;
		System.out.println("The average of your inputs is " + averageOfInputs);
	}
}
