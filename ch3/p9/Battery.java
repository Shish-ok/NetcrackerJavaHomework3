package comm.netcracker.homework3.ch3.p9;

public class Battery {
    private final double capacity;
    public double batteryCharge;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.batteryCharge = capacity;
    }

    public void drain(double amount) {
        if (batteryCharge < amount) {
            batteryCharge = 0;
        }
        else {
            batteryCharge -= amount;
        }
    }

    public void charge() { batteryCharge = capacity; }

    public double  getRemainingCapacity() { return batteryCharge; }
}
