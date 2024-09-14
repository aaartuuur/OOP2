package num1;

public class Dogovor {
    private Prodavec prodavec;
    private Pokupatel pokupatel;
    private Nedvisimost nedvisimost;
    public Dogovor(Prodavec prod, Pokupatel pokup, Nedvisimost ned){
        this.prodavec = prod;
        this.pokupatel = pokup;
        this.nedvisimost = ned;
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

    public void setPokupatel(Pokupatel pokupatel) {
        this.pokupatel = pokupatel;
    }

    public Nedvisimost getNedvisimost() {
        return nedvisimost;
    }

    public void setNedvisimost(Nedvisimost nedvisimost) {
        this.nedvisimost = nedvisimost;
    }

    public void print(){
        System.out.println(pokupatel.getSurname() + " " + pokupatel.getName());
        System.out.println(prodavec.getSurname() + " " + prodavec.getName());
        nedvisimost.print();
    }
}
