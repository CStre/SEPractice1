public abstract class Herbivore extends Animals
{
	public Herbivore(String species, String homeStatus, String hungry, String name)
	{
		super(species, homeStatus, name, hungry);
	}

	public void whatIEat()
	{
		System.out.println("I eat plants");
	}
}
			
