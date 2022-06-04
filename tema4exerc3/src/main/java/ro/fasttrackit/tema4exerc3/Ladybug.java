package ro.fasttrackit.tema4exerc3;

public record Ladybug() implements Insects
{
	@Override
	public void go()
	{
		System.out.println("flying");
	}

	@Override
	public void makeSound()
	{
		System.out.println("bzz");
	}

}
