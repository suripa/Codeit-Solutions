package Entidades;


public abstract class Tripulante {
	
	protected String name;

	public Tripulante() 
	{
	}
	
	public Tripulante(String name) 
	{
		this.name = name;	
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean equals(Object obj) 
	{	
		Tripulante dup = (Tripulante) obj;
		return this.getName().equals(dup.getName());
	}
	
}
