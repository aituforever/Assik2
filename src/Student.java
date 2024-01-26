public class Student extends Person{ //Student inherits Person
    private double gpa;//private var for students gpa
    private static final double stipendia = 36660.00;//constant for our low stipendia(assigned to class and always constant)

    public Student() {
        super();
    }//default constructor, which calls superclass(Person) constructor

    public Student(String name, String surname, double gpa) { super(name, surname); this.gpa = gpa;}//3 arg constructor with superclass constructor for name and surname

    public double getGpa() {
        return gpa;
    }//getter - gpa

    public void setGpa(double gpa) {
        this.gpa = gpa;
    } //setter - gpa

    @Override
    public String toString() {
        return "Student: " + super.toString();
    } //Overriding ToString again to return student data, where also calling the superclass tostring

    @Override
    public String getPosition() {
        return "Student";
    }//Overriding getposition method, to return new value - student

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? stipendia : 0.0;
    }//Overriding the payment method to either return the small money or student is too not smart
}

