package practise2;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int numbers[] = new int[5];

		System.out.println("Enter 5 elements :");
		Scanner sc= new Scanner(System.in);

		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}

		
		System.out.println("Array contains :");
		for(int j=0;j<numbers.length;j++)
		{
			System.out.println(numbers[j]);
		}
		
		for(int element:numbers) //Enhanced for loop only for print not for accepting values
		{
			System.out.println(element);
		}

	}

}
