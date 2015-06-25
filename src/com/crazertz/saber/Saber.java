package com.crazertz.saber;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Saber 
{
		
		public static void print(String stuff)
		{
			System.out.println(stuff);
		}
		
		
		
		
		public static void main(String[]args) throws InterruptedException 
		{
			
			print("Welcome to Saber");
			Game game = new Game("Saber!", 700, 700);
			game.start();
			while (true)
			{
				
				print("running...");
				Thread.sleep(1000);

			}
			

		}
				
}
