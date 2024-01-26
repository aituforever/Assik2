import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(); //Creating arraylist to store objects of Person
        people.add(new Student("Harry", "Potter", 4.0));//Objects themselves, which being added to arraylist
        people.add(new Employee("John", "Wick", "Baba Yaga", 999999.78));
        people.add(new Student("Moldahmet", "Abilou", 2.0));
        people.add(new Employee("Arnold", "Schwarzenigger", "Cool Guy", 56000.00));

        Collections.sort(people); //Sorting the arraylist, but
        printData(people); //Print the list(sorted)
    }

    public static void printData(Iterable<Person> people) { //printing method in iterable collection
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");//print each person
        }
    }
}