package num1;

public class Dogovor {

    private Prodavec prodavec;
    private Pokupatel pokupatel;
    private Interface inter;
    public Dogovor(Prodavec prod, Pokupatel pokup, Interface in){
        this.prodavec = prod;
        this.pokupatel = pokup;
        this.inter = in;
    }
    public void print(){
        System.out.println(pokupatel.getSurname() + " " + pokupatel.getName());
        System.out.println(prodavec.getSurname() + " " + prodavec.getName());
        inter.print();

    }
    public void print(int contractNumber){
        System.out.println(pokupatel.getSurname() + " " + pokupatel.getName());
        System.out.println(prodavec.getSurname() + " " + prodavec.getName());
        inter.print();
        System.out.println("Номер договора: " + contractNumber);
    }
}
