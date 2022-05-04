package comm.netcracker.homework3.ch8;

public class TesterLock {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(1, 1, 1);
        lock.turnRight(39);
        lock.turnLeft(40);
        lock.turnRight(40);
        System.out.println(lock.open());
    }
}
