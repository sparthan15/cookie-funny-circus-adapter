package org.example.categories;

import lombok.Getter;

@Getter
class Donkey extends Animal{

    Donkey(String name){
        super(name, Sound.UH_UH_AH);
    }

    public static class DonkeyAdapter extends Donkey {
        public DonkeyAdapter(Animal adaptee) {
            super(adaptee.getName());
        }
    }
}
