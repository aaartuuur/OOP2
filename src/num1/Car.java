package num1;

public class Car extends Nedvisimost{
    private int horsepower;
    public Car(String nam, int c, int horse) {
        super(nam, c);
        this.horsepower = horse;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    @Override
    public void print(){
        System.out.println(super.getName() + " " + super.getCost() + " " + horsepower);
    }
}
