package com.crazertz.saber;


import com.crazertz.saber.display.Display;

public class Game implements Runnable
{
	private Display display;
	private int width;
	private int height;
	Thread thread;
	
	public Game(String title, int width, int height)
	{
		
		
		this.width = width;
		this.height = height;
		
		display = new Display(title, width, height);
	}
	
	public void Run()
	{
		
	}
	
	public synchronized void start()
	{
		thread = new Thread();
	}
	
	public synchronized void stop()
	{
		
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
	}

}
