public class Hippo extends Herbivore
{
	public Hippo(String species, String homeStatus, String name, String hungry)
	{
		super (species, homeStatus, name, hungry);	
	}

	public String whereIStay()
	{
		return("I stay in the lagoons.");
	}
}
