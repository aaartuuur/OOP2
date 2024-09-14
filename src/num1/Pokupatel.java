package num1;

public class Pokupatel {
    private String name;
    private String surname;

    public Pokupatel(String sur, String nam) {
        this.surname = sur;
        this.name = nam;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
