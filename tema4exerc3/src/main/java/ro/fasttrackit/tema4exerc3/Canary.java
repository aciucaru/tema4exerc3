package ro.fasttrackit.tema4exerc3;

public non-sealed class Canary extends Bird
{
	// un canar are un sunet diferit de cel al clasei Bird pe care o mosteneste, deci se suprascrie aceasta metoda
	@Override
	public void makeSound()
	{
		System.out.println("tweet");
	}
	
}
