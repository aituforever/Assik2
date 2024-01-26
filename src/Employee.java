public class Employee extends Person{//Employee inherits Person
    private String position;//private var of position
    private double salary;//private var of salary, which is more than 36600
    public Employee() {
        super();
    }//default constructor
    public Employee(String name, String surname, String position, double salary) {super(name, surname);this.position = position;this.salary = salary;}// constructor with 4 args, 2 from person(super) class, 2 from employee

    public String getPosition() {
        return position;
    }//getter - position

    public void setPosition(String position) {
        this.position = position;
    } //setter - position

    public double getSalary() {
        return salary;
    }//getter - salary

    public void setSalary(double salary) {
        this.salary = salary;
    }//setter - salary

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }//Overriding again to return employee added data of person(super())

    @Override
    public double getPaymentAmount() {
        return salary;
    }//Overriding again method to return not stipend but more money - salary

}
