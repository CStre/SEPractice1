import java.util.Scanner;
class Zoo
{

	static Animals[] animals = 
	{
		new Hippo("Hippo", "home", "Hippono", "not hungry"),
		new Flamingo("Flamingo", "not home", "Tammey", "very hungry")	
	};

	public static void printName(Animals selection)
	{	
		System.out.println("My name is " + selection.getName());
	}
	
	public static void printHungerStatus(Animals selection)
	{
		System.out.println("I am" +  selection.getHungry());
	}
	
	public static void printHomeStatus(Animals selection)
	{
		System.out.println("I am" + selection.gethomeStatus());
	}
	public static void printSpecies(Animals selection)
	{	
		System.out.println("I am a " + selection.getSpecies());

	}

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		Class[] classes;
		System.out.println("Choose what animal to learn about:");
		System.out.println("(a) Hippo");
		System.out.println("(b) Flamingo");
		String input = kb.nextLine();		

		if(input.equals("a"))
		{
			printSpecies(animals[0]);
			printName(animals[0]);
			printHomeStatus(animals[0]);
			printHungerStatus(animals[0]);			
			System.out.println();	
		}
		else if(input.equals("b"))
		{
			printSpecies(animals[1]);
			printName(animals[1]);
			printHomeStatus(animals[1]);
			printHungerStatus(animals[1]);
			System.out.println();		
		}
		else
			System.out.print("Error. Wrong input:(");		
	}

}
