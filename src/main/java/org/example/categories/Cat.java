package org.example.categories;

import lombok.Getter;

@Getter
class Cat extends Animal{

    Cat(String name){
        super(name, Sound.MEOW);
    }

    public static class CatAdapter extends Cat {
        public CatAdapter(Animal adaptee) {
            super(adaptee.getName());
        }
    }
}
