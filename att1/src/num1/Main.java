package num1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokupatel pok = new Pokupatel("Иванов", "Иван");
        Prodavec prod = new Prodavec("Олегов", "Олег");
        Flat flat = new Flat("Квартира", 1000);
        Car car = new Car("Машина", 1000000, 1000);
        Dogovor dogovor = new Dogovor(prod, pok, car);
        dogovor.print(12345);

        List<Interface> list = new ArrayList<>();
        list.add(flat);
        list.add(car);

        for(Interface i : list){
            i.print();
        }
    }
}
