package com.jamesrosko.patterns.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

    Map<String, String> kindToName;

    public AnimalFactory() {
        kindToName = new HashMap<String, String>();
        kindToName.put("cat", "fifi");
        kindToName.put("dog", "fido");
    }

    public Animal createAnimal(String kind) {
        Animal animal = new Animal();
        animal.setName("unknown");
        if (kindToName.containsKey(kind)) {
            animal.setName(kindToName.get(kind));
        }
        return animal;
    }

}
