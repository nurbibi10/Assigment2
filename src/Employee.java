public class Employee extends Person{
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }


}
