public class employeeHW10 {
    private String name;

    private double salary;

    public employeeHW10(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double rate){
        salary=salary+(salary*(rate/100));
    }

    @Override
    public String toString() {
        return "Name = " + name +"\nSalary = " + salary ;
    }
}
