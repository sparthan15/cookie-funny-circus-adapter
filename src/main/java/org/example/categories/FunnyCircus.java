package org.example.categories;

import lombok.Getter;

@Getter
public class FunnyCircus {

    public Donkey donkey;
    private Bird bird;
    private Dog dog;
    private Cat cat;

    public FunnyCircus() {
        bird = new Bird("Kim");
        dog = new Dog("Bob");
        cat = new Cat("Micka");
        donkey = new Donkey("Mongo");
        System.out.println("Animals!");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(bird);
        System.out.println(donkey);
        System.out.println();
    }

    public void show() {
        System.out.println("Show!!");
        System.out.println(new Bird.BirdAdapter(donkey));
        System.out.println(new Dog.DogAdapter(cat));
        System.out.println(new Donkey.DonkeyAdapter(bird));
        System.out.println(new Cat.CatAdapter(dog));
    }


}
