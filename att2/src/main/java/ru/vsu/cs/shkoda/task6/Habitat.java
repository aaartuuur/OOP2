package ru.vsu.cs.shkoda.task6;

public class Habitat implements Comparable<Habitat>{
    private String type;  // Тип среды обитания
    private String climate;  // Климат
    private int size;  // Размер среды обитания

    public Habitat(String type, String climate, int size) {
        this.type = type;
        this.climate = climate;
        this.size = size;
    }

    @Override
    public int compareTo(Habitat habitat) {
        return this.type.compareTo(habitat.type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Habitat that = (Habitat) o;

        if (!type.equals(that.type)) return false;
        if (!climate.equals(that.climate)) return false;
        return size == that.size;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + climate.hashCode();
        result = 29 * result + size;
        return result;
    }
}
