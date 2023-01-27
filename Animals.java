public abstract class Animals
{
	String species;
	String name;
	String homeStatus;
	String hungry;

	public Animals(String species, String homeStatus, String name, String hungry)
	{
		this.species = species;
		this.homeStatus = homeStatus;
		this.name = name;
		this.hungry = hungry;
	}	

	public String getSpecies()
	{
		return species;
	}

	public String getName()
	{
		return name;
	}

	public String getHomeStatus()
	{
		return homeStatus;
	}

	public String getHungry()
	{
		return hungry;
	}
}
