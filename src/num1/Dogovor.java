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

    public Prodavec getProdavec() {
        return prodavec;
    }

    public void setProdavec(Prodavec prodavec) {
        this.prodavec = prodavec;
    }

    public Pokupatel getPokupatel() {
        return pokupatel;
    }

    public void print(){
        System.out.println(pokupatel.getSurname() + " " + pokupatel.getName());
        System.out.println(prodavec.getSurname() + " " + prodavec.getName());
        inter.print();

    }
}
