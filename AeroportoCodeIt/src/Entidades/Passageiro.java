package Entidades;

public class Passageiro extends Tripulante {
	
	public Passageiro() 
	{
		
	}
	
	public Passageiro(String name) 
	{
		this.name = name;
	}
	
	public String toString() 
	{
		return name;
	}
}
