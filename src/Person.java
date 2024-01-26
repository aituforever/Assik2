interface Payable { // Interface for classes that can be paid
    double getPaymentAmount(); //Method to get payment(money) amount
}
abstract public class Person implements Payable, Comparable<Person>{ //Creating abstract class which implements 2 interfaces
    private int id;//Unique id
    private static int nextId = 1; // Static var is used to assign unique ids
    private String name; //Name of person
    private String surname; //Surname of person
    public Person() {this.id = nextId++; this.name = ""; this.surname = "";} //Default constructor
    public Person(String name, String surname){ this.id = nextId++; this.name = name; this.surname = surname;
    }//Constructor with 2 args - name and surname

    public void setName(String name){
        this.name = name;
    } //setter - name
    public void setSurname(String surname){
        this.surname = surname;
    } //setter - surname
    public int getId(){
        return id;
    } //getter - id
    public String getName(){
        return name;
    } //getter - name
    public String getSurname(){
        return surname;
    } //getter - surname


    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }//Overrided default ToString method to return id, name and surname of person

    public abstract String getPosition();//Abstract method which returns person's position
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }//Compare 2 person based on their payment amount(ascending)
}