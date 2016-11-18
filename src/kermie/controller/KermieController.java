package kermie.controller;

import kermie.model.Kermie;
import kermie.view.KermieFrame;

public class KermieController
{
	private String [] words = {"This","is","the","next","level","of","Kermie","the","initialization","sequence"};
	private Kermie [] kermie;
	private int [] numbers;
	private KermieFrame appFrame;
	
	public KermieController()
	{
		showKermieLevelThree();
		kermie = new Kermie[5];
		
		for (int index = 0; index < kermie.length; index++)
		{
			kermie[index] = new Kermie("Kermie #" + index);
		}

		appFrame = new KermieFrame(this);
	}
	
	public void start()
	{
		kermie[0].setName("asdasd");
		
		for(Kermie current : kermie)
		{
			System.out.println(current);
		}
	}
	
	public void impactKermie()
	{
		for(Kermie currentKermie : kermie)
		{
			currentKermie.calculateKermieRank(10, 1);
		}
	}
	
	private void showKermieLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public Kermie[] getKermie()
	{
		return kermie;
	}
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
}
