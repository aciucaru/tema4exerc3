package ro.fasttrackit.tema4exerc3;

public sealed interface Animal permits Dog, Cat, Bird, Insects
{
	void go();
	void makeSound();
}
