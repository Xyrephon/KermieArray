package kermie.model;

public class Kermie
{

	private String name;
	private int kermieRank;
	
	public Kermie(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "This Kermie's name is " + name;
		description += ", and her/his/xyr Kermie ranks is: " + kermieRank;
		
		return description;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void calculateKermieRank()
	{
		kermieRank = (int) (Math.random() * 10);
	}
	
	public void calculateKermieRank(int scale)
	{
		kermieRank = (int) (Math.random() * scale);
	}
	
	public void calculateKermieRank(int scale, int shift)
	{
		kermieRank = (int) (Math.random() * scale) + shift;
	}
}
