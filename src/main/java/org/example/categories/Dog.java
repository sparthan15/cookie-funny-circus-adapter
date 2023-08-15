package org.example.categories;

import lombok.Getter;

@Getter
class Dog extends Animal {
    Dog(String name) {
        super(name, Sound.WOOF);
    }

    public static class DogAdapter extends Dog {
        public DogAdapter(Animal adaptee) {
            super(adaptee.getName());
        }
    }
}
