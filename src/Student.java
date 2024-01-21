public class Student extends Person{
    private double gpa;
    private static final double step = 36660.00;

    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;

    }
    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa=gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
