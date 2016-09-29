import java.util.Scanner;
public class TestArray
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		int[] myArray = new int [50];
		int index = 0;
		int a = input.nextInt();
		while(a != -1)
		{
			int i = 0;
			for ( i = 0; i < index; i++)
			{
				if (myArray [i] == a) break;
			}
			if ( i == index)
			{
				myArray[index] = a;
				index++;
			}
			a = input.nextInt();
		}
	for (int i = 0; i < index ; i++)
	System.out.println(myArray[i] + "  are number5");
	}
}