// This is the program of addition of two matrices
package Training.week_2;

public class AddMatrices 
{
	public static void main(String...args)
	{
		int arr1[][] = {{1,2,3,},{4,5,6,},{7,8,9}};
		int arr2[][] = {{10,11,12,},{13,14,15,},{16,17,18}};
		int ans[][] = new int[3][3];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				ans[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Printing the addition of the matrices");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
