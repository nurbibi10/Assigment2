import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Asem","Bahadyr", "Curator", 100000));
        people.add(new Student("Asel", "Kenzhetay", 2.3));
        people.add(new Student("Nabi", "Rakhmanberdiyeva", 3.7));
        people.add(new Employee("Maksat","Karzhaubaev", "curator", 250000.00));

        Collections.sort(people);
        Collections.reverse(people);
        printData(people);
    }
    public static void printData(Iterable<Person> people){
        for (Person person:people){
            System.out.println(person);
        }
    }

}