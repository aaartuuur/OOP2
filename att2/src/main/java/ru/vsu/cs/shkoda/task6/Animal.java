package ru.vsu.cs.shkoda.task6;

public class Animal implements Comparable<Animal>{

    private final String name;
    private final String species;
    private final Habitat habitat;
    public String getName() {
        return name;
    }
    public Habitat getHabitat() {
        return habitat;
    }

    public Animal(String name, String species, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.habitat.compareTo(animal.habitat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal that = (Animal) o;

        if (!name.equals(that.name)) return false;
        if (!species.equals(that.species)) return false;
        return habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + species.hashCode();
        result = 29 * result + habitat.hashCode();
        return result;
    }

}
