interface Payable {
    double getPaymentAmount();
}
abstract public class Person implements Payable, Comparable<Person>{
    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    public String ToString(){
        return id+name+surname;
    }
    public Person() {this.id = nextId++; this.name = ""; this.surname = "";}
    public Person(String name, String surname){ this.id = nextId++; this.name = name; this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }


    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public abstract String getPosition();

    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}