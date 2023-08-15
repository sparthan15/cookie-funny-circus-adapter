package org.example.categories;

import lombok.Getter;

@Getter
class Bird extends Animal {

    Bird(String name) {
        super(name, Sound.CHIRPING);
    }

    static class BirdAdapter extends Bird {

        public BirdAdapter(Animal adaptee) {
            super(adaptee.getName());
        }

    }
}