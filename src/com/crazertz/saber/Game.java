package com.crazertz.saber;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import com.crazertz.saber.display.Display;

public class Game implements Runnable
{
	private Display display;
	private int width;
	private int height;
	public String title;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private boolean running = false;
	private Thread thread;
	
	
	public Game(String title, int width, int height)
	{
		
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init()
	{
		display = new Display(title, width, height);
	}
	
	private void tick()
	{
		
	}
	
	private void render()
	{
		bs = display.getCanvas().getBufferStrategy();
		
	}
	
	@Override
	public void run() 
	{
		init();
		while(running)
		{
			tick();
			render();
		}
		
		stop();
	}
	
	public synchronized void start()
	{
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop()
	{
		if(running)
			return;
		running = false;
		try
		{
			thread.join();
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
