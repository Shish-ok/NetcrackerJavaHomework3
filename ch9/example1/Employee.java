package comm.netcracker.homework3.ch9.example1;

public class Employee {
    private String name;
    private double weeklyPay;

    public Employee() {

    }

    public Employee(String name, double weeklyPay) {
        this.name = name;
        this.weeklyPay = weeklyPay;
    }

    public void setName(String employeeName) { name = employeeName; }
    public String getName() { return name; }

    public double weeklyPay(int hoursWorked) {
        return weeklyPay / 5 * hoursWorked;
    }
}
