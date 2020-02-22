
/**
 @author Mark Crowe
 */
public class ThePostIncrementOperator
{
	public static void main(String[] args)
	{
		System.out.println("The Post Increment Operator");
		int number;
		//
		//	reset number
		//
		number = 1;

		System.out.println("Number=" + number);
		System.out.println("execute: number = number + 1;");
		number = number + 1;
		System.out.println("Number=" + number);
		System.out.println();
		//
		//	reset number
		//
		number = 1;
		System.out.println("Number=" + number);
		System.out.println("execute: number++;");
		number++;
		System.out.println("Number=" + number);
	}
}
