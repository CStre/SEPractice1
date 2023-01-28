public abstract class Animals
{
	String species;
	String name;

	public Animals(String species, String name)
	{
		this.species = species;
		this.name = name;
	}	

	public String getSpecies()
	{
		return species;
	}

	public String getName()
	{
		return name;
	}
}
