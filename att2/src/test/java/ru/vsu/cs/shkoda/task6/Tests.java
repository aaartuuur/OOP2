package ru.vsu.cs.shkoda.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.shkoda.task6.comparators.AnimalHabitatComparator;
import ru.vsu.cs.shkoda.task6.comparators.AnimalNameComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tests {
    Habitat h1 = new Habitat("forest", "cold", 1234);
    Animal a1 = new Animal("jacob", "wolf", h1);
    Animal a2 = new Animal("irina", "bird", h1);
    Animal a3 = new Animal("jumper", "hare", h1);

    Habitat h2 = new Habitat("sea", "cold", 9870);
    Animal a4 = new Animal("flipper", "dolphin", h2);
    Animal a5 = new Animal("motya", "turtle", h2);
    Animal a6 = new Animal("gorgona", "jellyfish", h2);

    Habitat h3 = new Habitat("pond", "warm", 132);
    Animal a7 = new Animal("klava", "frog", h3);
    Animal a8 = new Animal("chikibryak", "crayfish", h3);
    Animal a9 = new Animal("karas", "fish", h3);


    Animal a10 = new Animal("jacob", "wolf", h1);// такой же как a1
    Animal a11 = new Animal("jacob", "wolf", h1);
    Habitat h4 = new Habitat("sea", "cold", 9870); // такой же как h2

    @Test
    public void equalsAnimal() {
        Assertions.assertEquals(a10, a10);//рефлексивность

        Assertions.assertEquals(a1, a10);//симметричность
        Assertions.assertEquals(a10, a1);
        Assertions.assertNotEquals(a1, a2);
        Assertions.assertNotEquals(a2, a1);

        Assertions.assertEquals(a1, a10);//транзитивность
        Assertions.assertEquals(a1, a11);
        Assertions.assertEquals(a10, a11);

        Assertions.assertNotEquals(a4, a5);//постоянность
        Assertions.assertNotEquals(a4, a5);

        Assertions.assertNotEquals(a2, null);//неравенство с null
    }

    @Test
    public void hashCodeAnimal(){
        Assertions.assertEquals(a1.hashCode(), a10.hashCode());//у равных объектов один hashCode
        Assertions.assertEquals(a1.hashCode(), a10.hashCode());
        Assertions.assertEquals(a10.hashCode(), a11.hashCode());
    }

    @Test
    public void equalsHabitat() {
        Assertions.assertEquals(h2, h4);
        Assertions.assertEquals(h2, h4);
        Assertions.assertEquals(h4, h2);
        Assertions.assertNotEquals(h2, h3);
        Assertions.assertNotEquals(h3, h4);
        Assertions.assertNotEquals(h3, h4);
    }

    @Test
    public void hashCodeHabitat() {
        Assertions.assertEquals(h4.hashCode(), h2.hashCode());
    }

    @Test
    public void sortHabitat() {
        List<Habitat> habitats = Arrays.asList(h4, h2, h3, h1);
        Collections.sort(habitats);
        List<Habitat> expectedHabitats = Arrays.asList(h1, h3, h4, h2);
        Assertions.assertEquals(habitats, expectedHabitats);
    }

    @Test
    public void sortAnimalComparable() {
        List<Animal> animals = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        Collections.sort(animals);
        List<Animal> expectedAnimals = Arrays.asList(a1, a2, a3, a10, a7, a8, a9, a4, a5, a6);
        Assertions.assertEquals(animals, expectedAnimals);
    }

    @Test
    public void sortAnimalComparator01() {
        List<Animal> animals = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        Collections.sort(animals, new AnimalHabitatComparator());
        List<Animal> expectedAnimals = Arrays.asList(a1, a2, a3, a10, a7, a8, a9, a4, a5, a6);
        Assertions.assertEquals(animals, expectedAnimals);
    }

    @Test
    public void sortAnimalComparator02() {
        List<Animal> animals = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        Collections.sort(animals, new AnimalNameComparator());
        List<Animal> expectedAnimals = Arrays.asList(a8, a4, a6, a2, a1, a10, a3, a9, a7, a5);
        Assertions.assertEquals(animals, expectedAnimals);
    }

    @Test
    public void sortAnimalComparator03() {
        List<Animal> animals = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        Collections.sort(animals, new AnimalHabitatComparator().thenComparing(new AnimalNameComparator()));
        List<Animal> expectedAnimals = Arrays.asList(a2, a1, a10, a3, a8, a9, a7, a4, a6, a5);//name потом habitat
        Assertions.assertEquals(animals, expectedAnimals);
    }



}
