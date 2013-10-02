package com.jamesrosko.patterns.factorymethod;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.jamesrosko.patterns.factorymethod.Animal;
import com.jamesrosko.patterns.factorymethod.AnimalFactory;

public class AnimalFactoryTest {

    @Test
    public void createAnimalNotNull() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.createAnimal("cat");

        assertThat(animal, notNullValue());
    }
    
    @Test
    public void createAnimalCat() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.createAnimal("cat");

        assertThat(animal.getName(), is("fifi"));
    }

    @Test
    public void createAnimalDog() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.createAnimal("dog");

        assertThat(animal.getName(), is("fido"));
    }
    

    @Test
    public void createAnimalUnknown() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.createAnimal("someUnknownAnimal");

        assertThat(animal.getName(), is("unknown"));
    }
}
