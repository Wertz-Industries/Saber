import java.util.Scanner;
public class ggg 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		boolean play = true;
		while(play == true)
		{
			System.out.println("Keep playing?true or false?");
			play = nextBoolean();
		}
		System.out.println("!Game Over!");
	}
}
