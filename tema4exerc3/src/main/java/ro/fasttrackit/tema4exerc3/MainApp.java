package ro.fasttrackit.tema4exerc3;

import java.util.ArrayList;
import java.util.List;

public class MainApp 
{
    public static void main( String[] args )
    {
        PetShop petShop = new PetShop();
        
        System.out.println("adding pets:");
        petShop.addPet(new Dog());
        petShop.addPet(new Cat());
        petShop.addPet(new Bird());
        petShop.addPet(new Parrot());
        petShop.addPet(new Canary());
        petShop.addPet(new Chicken()); // din nefericire va fi permisa adaugarea unui Chicken, chiar daca nu este animal de companie
        petShop.addPet(new Fly()); // clasa PetShop nu ve permite adaugarea unui Insect si va afisa un mesaj
        System.out.println();
        
        System.out.println("letting pets go for a while:");
        // se apeleaza metoda go() specifica fiecarui 'Animal' din sirul interior al petShop
        petShop.letPetsGoForAWhile();
        System.out.println();
        
        System.out.println("pets making sounds:");
        // se apeleaza metoda makeSound() specifica fiecarui 'Animal' din sirul interior al petShop
        petShop.petsMakingNoise();
        System.out.println();
        
        System.out.println("pets custom behaviour:");
        // se apeleaza cate o metoda unica specifica fiecarei clase Dog, Cat sau Bird
        // pentru fiecare 'Animal' din sirul interior al petShop
        petShop.petsCustomBehaviour();
    }
}
