package num1;

public class Nedvisimost {
    private String name;
    private int cost;

    public Nedvisimost(String nam, int c) {
        this.name = nam;
        this.cost = c;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = this.name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void print(){
        System.out.println(name + " " + cost);
    }
}
