package ro.fasttrackit.tema4exerc3;

public record Cat() implements Animal
{
	@Override
	public void go()
	{
		System.out.println("walking on four legs");
	}

	@Override
	public void makeSound()
	{
		System.out.println("mieow!");
	}

	// metoda specifica doar clasei 'Cat'
	public void climbTree()
	{
		System.out.println("climbing a tree");
	}
}
