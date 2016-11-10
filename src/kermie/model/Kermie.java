package kermie.model;

public class Kermie
{

	private String name;
	
	public Kermie(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "This Kermie's name is " + name;
		
		return description;
	}
}
