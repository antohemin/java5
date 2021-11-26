package lab5;

public class exeleven {
	public static void main(String[]args)
	{
		System.out.println(" ##### Pattern 11 ######");
		System.out.println();
		int i ,j,p=1,k, n;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++,p++)
				System.out.print(p+ " ");
			n=p;
			for(k=1;k<i;k++,n--)
				System.out.print((n-2)+ " ");
			
			System.out.println();
		}
	}

}
