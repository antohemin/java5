package lab5;
import java.util.Scanner;


public class exone {
	public static void main(String[] args)
	{
		Scanner s= new Scanner( System.in);
		System.out.print(" ======The First Pattern=====");
		System.out.println();
		int i,j;
		for(i=0; i<8;i++)
		{
			for(j=0;j<(8-i);j++)
				System.out.print("*");
			System.out.println();
		}
		}
	}
