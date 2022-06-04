package ro.fasttrackit.tema4exerc3;

import java.util.ArrayList;
import java.util.List;

public class PetShop
{
	List<Animal> pets = new ArrayList<Animal>();
	
	public void addPet(Animal pet)
	{
		if(pet != null)
		{
			// deoarece clasa parinte 'Animal' este sealed si permite in mod explicit Dog, Cat, Bird sau Insect
			// atunci se poate filtra dupa aceste tipuri, ca sa se realizeze un sir de animale de companie
			if(pet instanceof Dog || pet instanceof Cat || pet instanceof Bird)
			{
				pets.add(pet);
			}
			else
				// daca argumentul 'pet' nu este de niciunul dintre tipurile de mai sus, atunci inseamna ca e garantat
				// de tip 'Insect' (caci doar atat mai "permite" clasa 'Animal' la mostenire)
				// iar insectele nu vor fi adaugate
				System.out.println("insects are not pets!!");
		}
	}
	
	public void letPetsGoForAWhile()
	{
		// pentru fiecare element, se printeaza numele clasei si se apeleaza metoda go(), ce printeaza si ea un mesaj
		pets.stream()
			.forEach((Animal pet) -> {System.out.print(pet.getClass().getSimpleName() + ": "); pet.go();});
	}
	
	public void petsMakingNoise()
	{
		// pentru fiecare element, se printeaza numele clasei si se apeleaza metoda makeSound(), ce printeaza si ea un mesaj
		pets.stream()
			.forEach((Animal pet) -> {System.out.print(pet.getClass().getSimpleName() + ": "); pet.makeSound();});
	}
	
	public void petsCustomBehaviour()
	{
		// aceasta metoda apeleaza cate o metoda specifica (unica pt. fiecare tip) a fiecarui element din sirul 'pets'
		// scopul acestei metoda nu este sa se simuleze pattern match (care nu exista in Java) ci sa se foloseasca
		// faptul ca este suficient sa se verifice doar cele 3 cazuri 'Dog', 'Cat', 'Bird', deoarece clasa parinte 'Animal'
		// este sealed si nu permite decat 'Dog', 'Cat', 'Bird' si 'Insect', iar aceasta clasa (PetShop) nu permite oricum
		// adaugarea de obiecte de tip 'Insect'
		
		// nu toate obiectele ce se pot adauga voar avea rezultatele scontate daca nu au implementat un comportament specific
		// de exemplu, se poate adauga si 'Chicken' (caci este un 'Bird'), iar comportamentul sau specifica va afisa:
		// "making nest", desi gainile nu fac cuibuiri
		
		for(Animal pet : pets)
		{
			// smilar cu pattern matching-ul din Scala, doar ca realizat manual
			if(pet instanceof Dog)
			{
				System.out.print(pet.getClass().getSimpleName() + ": ");
				((Dog) pet).chewBone();
			}
			
			if(pet instanceof Cat)
			{
				System.out.print(pet.getClass().getSimpleName() + ": ");
				((Cat) pet).climbTree();
			}
			
			if(pet instanceof Bird)
			{
				System.out.print(pet.getClass().getSimpleName() + ": ");
				((Bird) pet).makeNest();
			}
		}
	}
}
