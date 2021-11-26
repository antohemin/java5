package lab5;

public class extwelve {
	public static void main(String[] args)
	{
		System.out.println("##### Pattern 12 #######");
		System.out.println();
		int i, j;
		for(i=1;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
			int n=(int) Math.pow(j, i);
			System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}	
