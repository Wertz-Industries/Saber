import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;
public class Saber 
	{

		public static void main(String[]args) 
			{
				Random gen = new Random();
				boolean ranBool = gen.nextBoolean();
				System.out.println(ranBool);
				System.out.println( "What is your name?");
				Scanner input = new Scanner(System.in);
				String playerName;
				playerName = input.nextLine();
	    		int playerLevel = 1;
	    		System.out.println( "You are " + playerName + " the level " + playerLevel + " adventurer.");
		
				int Mana = 50;
				int XP = 0;
				int Level = 0;
				int Enemies = 3;
				int Alies = 2;
				int Health = 100;
	    		boolean Damage = false ;
	    		if(Damage == true)
	    			{
	    				System.out.println( "Hit! you lost " + (5) + " Health");
	    				System.out.println("Your current health is " + (Health - 5));
	    				System.out.println("XP receved = " + (XP + 10));
	    			}
	    		if(XP > 100)
	    			{
	    				playerLevel++;
	    			}
	    		JOptionPane.showMessageDialog(null, "Click ok to continue", "Saber", JOptionPane.INFORMATION_MESSAGE);
	    			{
	    				
	    			}
	    		String ok = input.nextLine(); 
			}
	}
