import java.util.Scanner;
class Zoo
{

	static Animals[] animals = 
	{
		new Hippo("Pygmy hippo", "Hippono"),
		new Flamingo("Chilean flamingo", "Tammey")	
	};

	public static void printName(Animals selection)
	{	
		System.out.println("My name is " + selection.getName());
	}

	public static void printSpecies(Animals selection)
	{	
		System.out.println("I am a " + selection.getSpecies());

	}

	public static void main(String args[] )
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose what animal to learn about:");
		System.out.println("(a) Hippo");
		System.out.println("(b) Flamingo");
		String input = kb.nextLine();	
		kb.close();	

		if(input.equals("a"))
		{
			printSpecies(animals[0]);
			printName(animals[0]);			
			System.out.println();	
		}
		else if(input.equals("b"))
		{
			printSpecies(animals[1]);
			printName(animals[1]);
			System.out.println();		
		}
		else
			System.out.print("Error. Wrong input :(");		
	}

}