public class Person implements Payable, Comparable<Person>{
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
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return getPosition()+":"+ id + ". " + name + " " + surname;
    }
    @Override
    public double getPaymentAmount(){
        return 0;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(other.getPaymentAmount(), getPaymentAmount());
    }
}