public abstract class Herbivore extends Animals
{
	public Herbivore(String species, String name)
	{
		super(species, name);
	}

	public void whatIEat()
	{
		System.out.println("I eat plants");
	}
}			
