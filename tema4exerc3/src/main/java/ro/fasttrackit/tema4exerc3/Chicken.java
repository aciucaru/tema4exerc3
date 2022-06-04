package ro.fasttrackit.tema4exerc3;

public non-sealed class Chicken extends Bird
{
	// o gaina nu poate zbura (asa cum s-a presupus pt. clasa parinte Bird), deci se suprascrie metoda go()
	@Override
	public void go()
	{
		System.out.println("walking on two legs");
	}

	// si sunetul este diferit de cel al clasei parinte Bird, deci se suprascrie si aceasta metoda
	@Override
	public void makeSound()
	{
		System.out.println("cluck");
	}
}
