import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("Harry", "Potter", 4.0));
        people.add(new Employee("John", "Wick", "Baba Yaga", 999999.78));
        people.add(new Student("Moldahmet", "Abilou", 2.0));
        people.add(new Employee("Arnold", "Schwarzenigger", "Cool Guy", 56000.00));

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}