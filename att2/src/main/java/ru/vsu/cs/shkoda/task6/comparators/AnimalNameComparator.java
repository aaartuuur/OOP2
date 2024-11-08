package ru.vsu.cs.shkoda.task6.comparators;

import ru.vsu.cs.shkoda.task6.Animal;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2){
        return a1.getName().compareTo(a2.getName());
    }

}

