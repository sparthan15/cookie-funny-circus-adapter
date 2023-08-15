package org.example.categories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void testBirdCanBeAdapted(){
        Animal dog = Animal.createDog("Bob");
        Bird adapted = new Bird.BirdAdapter(dog);
        Assertions.assertNotNull(adapted);
        Assertions.assertTrue(Animal.Sound.CHIRPING.equals(adapted.getSound()));
    }

    @Test
    void testDogCanBeAdapted(){
        Animal dog = Animal.createDog("Bob");
        Dog adapted = new Dog.DogAdapter(dog);
        Assertions.assertNotNull(adapted);
        Assertions.assertTrue(Animal.Sound.WOOF.equals(adapted.getSound()));
    }

    @Test
    void testCatCanBeAdapted(){
        Animal dog = Animal.createDog("Bob");
        Dog adapted = new Dog.DogAdapter(dog);
        Assertions.assertNotNull(adapted);
        Assertions.assertTrue(Animal.Sound.WOOF.equals(adapted.getSound()));
    }

    @Test
    void testMonkeyCanBeAdapted(){
        Animal dog = Animal.createDog("Bob");
        Donkey adapted = new Donkey.DonkeyAdapter(dog);
        Assertions.assertNotNull(adapted);
        Assertions.assertTrue(Animal.Sound.UH_UH_AH.equals(adapted.getSound()));
    }
}
