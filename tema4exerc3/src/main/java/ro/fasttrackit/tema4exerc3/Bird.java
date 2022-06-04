package ro.fasttrackit.tema4exerc3;

public sealed class Bird implements Animal permits Canary, Parrot, Chicken
{
	@Override
	public void go()
	{
		System.out.println("flying");
	}

	@Override
	public void makeSound()
	{
		System.out.println("chirp");
	}
	
	// metoda specifica doar clasei 'Bird'
	public void makeNest()
	{
		System.out.println("making nest");
	}
}
