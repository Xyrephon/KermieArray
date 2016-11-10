package kermie.controller;

import kermie.model.Kermie;

public class KermieController
{
	private String [] words;
	private Kermie [] kermie;
	private int [] numbers;
	
	public KermieController()
	{
		numbers = new int [20];
		words = new String [5];
		kermie = new Kermie[5];
	}
	
	public void start()
	{
		for (int index = 0; index < kermie.length; index++)
		{
			kermie[index] = new Kermie("Kermie #" + index);
		}
		
		for(Kermie current : kermie)
		{
			System.out.println(current);
		}
	}
}
