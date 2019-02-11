package week7day4;

public class DiamondPattern {

	public static void main(String[] args) {
		int i, j, k;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<5;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}
}

