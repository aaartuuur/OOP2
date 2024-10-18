package num1;

public class Car implements Interface{
    String name;
    int cost;
    private int horsepower;
    public Car(String nam, int c, int horse) {
        name = nam;
        cost = c;
        this.horsepower = horse;
    }
    public void print(){
        System.out.println(name + " " + cost + " " + horsepower);
    }
}
