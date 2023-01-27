public class Flamingo extends Herbivore
{
	public Flamingo(String species, String homeStatus, String name, String hungry)
	{
		super(species, homeStatus, name, hungry);
	}

	public String whereIStay()
	{
		return("I stay in the lagoons but also I fly in the sky.");
	}
}
