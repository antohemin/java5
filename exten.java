package lab5;

public class exten {
	public static void main(String[] args)
	{
		int i,j;
		System.out.println(0);
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.print(0);
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			}	
	}

}
