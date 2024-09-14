package num1;

public class Main {
    public static void main(String[] args) {
        Pokupatel pok = new Pokupatel("Иванов", "Иван");
        Prodavec prod = new Prodavec("Олегов", "Олег");
        Nedvisimost car = new Nedvisimost("Машина", 1000000);
        Dogovor dog = new Dogovor(prod, pok, car);
        dog.print();
    }
}
