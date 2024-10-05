package num1;

public abstract class Nedvisimost implements Interface{
    String name;
    int cost;
    public Nedvisimost(String nam, int c) {
        name = nam;
        cost = c;
    }
    public void print(){
        System.out.println(name + " " + cost);
    }
}
