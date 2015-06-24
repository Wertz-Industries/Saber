package com.crazertz.saber;

import com.crazertz.saber.display.Display;

public class Saber 
{
		
		public static void print(String stuff)
		{
			System.out.println(stuff);
		}
		
		
		public static void main(String[]args) throws InterruptedException 
		{
			
			print("Welcome to Saber");
			
			new Display("Saber!", 500, 500);
			
			while (true)
			{
				
				print("running...");
				Thread.sleep(1000);

			}
		}
				
}
