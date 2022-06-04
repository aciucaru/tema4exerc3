package ro.fasttrackit.tema4exerc3;

public class Fly implements Insects
{
	@Override
	public void go()
	{
		System.out.println(Fly.class.getSimpleName() + ": flying");
	}

	@Override
	public void makeSound()
	{
		System.out.println(Fly.class.getSimpleName() + ": bzzzzz");
	}
}
