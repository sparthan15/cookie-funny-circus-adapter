package org.example;

import org.example.categories.Animal;
import org.example.categories.FunnyCircus;

import java.util.List;

/**
 * Hello world!
 */
public class CircusApp {
    private List<Animal> animals;

    public static void main(String[] args) {
        FunnyCircus circus = new FunnyCircus();
        circus.show();

    }

}
