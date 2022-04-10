package advanced;

import java.util.Scanner;

public class Problem1_1 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=input.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}

}
