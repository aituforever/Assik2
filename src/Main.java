import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Singer", 27045.78));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.0));
        people.add(new Employee("George", "Harrison", "Guitarist", 50000.00));

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}