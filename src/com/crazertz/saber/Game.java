package com.crazertz.saber;

import com.crazertz.saber.display.Display;

public class Game implements Runnable
{
	private Display display;
	private int width;
	private int height;
	
	public Game(String title, int width, int height)
	{
		this.width = width;
		this.height = height;
		
		display = new Display(title, width, height);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
