package comm.netcracker.homework3.ch9.example1;

public class HourlyEmployee extends Employee {
    private double hourlyWage;

    public HourlyEmployee(String name, double wage) {
        setName(name);
        hourlyWage = wage;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40) {
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        }
        return pay;
    }
}
