import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class WhatDoesThisCodeDo
{
	public static void main(String[] args)
	{
		System.out.println("What does this code do?");

		Scanner sc = new Scanner(System.in);
		System.out.println("No Clues?");
		int c = sc.nextInt();
		double a, s = 0;
		for(int i = 1; i <= c; i = i + 1)
		{
			System.out.println("No Clues " + i);
			int n = sc.nextInt();
			s = s + n;
		}
		a = s / c;
		System.out.println("NO CLUES! " + a);
	}
}
