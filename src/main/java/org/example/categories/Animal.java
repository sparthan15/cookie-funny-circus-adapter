package org.example.categories;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Animal {
    protected String name;
    protected Sound sound;

    Animal(String name, Sound sound) {
        this.sound = sound;
        this.name = name;
    }

    public static Animal createCat(String name) {
        return new Cat(name);
    }

    public static Animal createDonkey(String name) {
        return new Donkey(name);
    }

    public static Animal createBird(String name) {
        return new Bird(name);
    }

    public static Animal createDog(String name) {
        return new Dog(name);
    }

    public enum Sound {
        WOOF("Woof!"),
        CHIRPING("Chirping!"),
        MEOW("Meow!"),
        UH_UH_AH("Uh uh AH!");
        private final String sound;

        Sound(String sound) {
            this.sound = sound;
        }
    }
}
