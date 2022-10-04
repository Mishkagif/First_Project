public class User {
    String name;
String surname;
    public User(String surname) {
        this.surname=surname;
        System.out.println("Created..."+surname);
    }

    public User(String name,String surname) {
        this(surname);
        this.name = name;

    }

    void print() {
        System.out.println(this);
    }
@Override
    public String toString(){
        return "User{"+name+'}';
}
}