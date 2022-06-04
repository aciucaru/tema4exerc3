package ro.fasttrackit.tema4exerc3;

public final class Dog implements Animal
{
	@Override
	public void go()
	{
		System.out.println("walking on four legs");
	}

	@Override
	public void makeSound()
	{
		System.out.println("woof!");
	}
	
	// metoda specifica doar clasei 'Dog'
	public void chewBone()
	{
		System.out.println("chewing bone");
	}
}
