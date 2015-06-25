package com.crazertz.saber;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import com.crazertz.saber.display.Display;
import com.crazertz.saber.gfx.ImageLoader;

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
	
	private BufferedImage ship, marine;
	
	public Game(String title, int width, int height)
	{
		
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init()
	{
		display = new Display(title, width, height);
		ship = ImageLoader.loadImage("/textures/fighter-000.png");
		
		marine = ImageLoader.loadImage("/textures/Space-Marine-Game-Sprite-Sheet.jpg");
	}
	
	private void tick()
	{
		
	}
	
	private void render()
	{
		bs = display.getCanvas().getBufferStrategy();
		
		if (bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw here!

		g.drawImage(ship, 50, 50, null);
		g.drawImage(marine, 50, 200, null);
		
		// End drawing!
		bs.show();
		g.dispose();
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
		if (running)
			return;
		
		running = true;
		
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop()
	{
		if (!running)
			return;
		
		running = false;
		
		try
		{
			thread.join();
		} 
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
