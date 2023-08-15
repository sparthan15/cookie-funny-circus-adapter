package org.example;

import org.example.categories.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void canCreateCats(){
        Animal cat = Animal.createCat("Micka");
        assertNotNull(cat);
        assertTrue(Animal.Sound.MEOW.equals(cat.getSound()));
    }

    @Test
    void canCreateDogWoof(){
        Animal dog = Animal.createDog("Bob");
        assertNotNull(dog);
        assertTrue(Animal.Sound.WOOF.equals(dog.getSound()));
    }

    @Test
    void canCreateDonkey(){
        Animal donkey = Animal.createDonkey("Mongo");
        assertNotNull(donkey);
        assertTrue(Animal.Sound.UH_UH_AH.equals(donkey.getSound()));
    }

    @Test
    void canCreateBird(){
        Animal bird = Animal.createBird("Kim");
        assertNotNull(bird);
    }
}
