public class Student extends Person{
    private double gpa;
    private static final double step = 36660.00;

    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;

    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
