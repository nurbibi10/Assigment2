public class Employee extends Person{
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String getPosition() {
        return position;
    }


}
