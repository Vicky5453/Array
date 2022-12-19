package Array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your length");
		int length = sc.nextInt();
		int[] ar = new int[length];

		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("enter the value");
			ar[i] = sc.nextInt();
		}

		// int[] ar = {50,40,30,20,10};

		for (int j = 1; j < ar.length; j++)   //  j<3
		{
			for (int i = 0; i < ar.length - j; i++) 
			{
				if (ar[i] > ar[i + 1]) // ar[i]<ar[i+1] ---decenting order
				{
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
		}
		for (int k = 0; k < ar.length; k++) 
		{
			System.out.println(ar[k]);
		}
    //   System.out.println(ar[ar.length-1]);
	}

}
