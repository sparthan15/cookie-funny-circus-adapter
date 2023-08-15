package org.example.categories;

import org.example.categories.Animal;
import org.example.categories.FunnyCircus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircusTest {


    @Test
    void circusHasAnimals() {
        FunnyCircus circus =new FunnyCircus();
        Assertions.assertNotNull(circus);
        assertTrue(Animal.Sound.WOOF.equals(circus.getDog().getSound()));
        assertTrue(Animal.Sound.MEOW.equals(circus.getCat().getSound()));
        assertTrue(Animal.Sound.CHIRPING.equals(circus.getBird().getSound()));
        assertTrue(Animal.Sound.UH_UH_AH.equals(circus.getDonkey().getSound()));
    }

    @Test
    void afterTheShowAnimalsStillBeingTheSame() {
        FunnyCircus circus = new FunnyCircus();
        circus.show();
        assertTrue(Animal.Sound.WOOF.equals(circus.getDog().getSound()));
        assertTrue(Animal.Sound.MEOW.equals(circus.getCat().getSound()));
        assertTrue(Animal.Sound.CHIRPING.equals(circus.getBird().getSound()));
        assertTrue(Animal.Sound.UH_UH_AH.equals(circus.getDonkey().getSound()));
    }
}
