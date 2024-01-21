public class Person{
    private String name;
    private String surname;
    private int id;
    private static int  couter = 1;

    public Person(){
        this.id=couter++;
    }
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
}
