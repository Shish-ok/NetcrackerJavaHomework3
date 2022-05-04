package comm.netcracker.homework3.ch8;

// Глеб, честно впервые встретил такой кодовой замок, поэтому подробно изучил механизм и перенёс его в код в виде объекта
// Если что-то не так, то скажи, пожалуйста

public class ComboLock {
    private final int secret1;
    private final int secret2;
    private final int secret3;
    private int dialPointer;
    private int[] dialHistory = { -1, -1, -1 }; // Изначально прописываем истории выбираемых чисел и поворотов невозможные значения
    private String[] movements = { "no", "no", "no" };

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    public void reset() {
        dialPointer = 0; // Сбрасываем всё к значениями, которые были инициализированы изначально
        dialHistory[0] = -1;
        dialHistory[1] = -1;
        dialHistory[2] = -1;
        movements[0] = "no";
        movements[1] = "no";
        movements[2] = "no";
    }
    public void turnRight(int ticks) {
        dialHistory[0] = dialHistory[1];
        dialHistory[1] = dialHistory[2];
        System.out.println(dialPointer + " right");
        dialHistory[2] = dialPointer;
        while (ticks > 1) {
            movements[0] = movements[1];
            movements[1] = movements[2];
            movements[2] = "right";
            ticks /= 40;
        }
        // Если мы прокрутим в одну строну 3 раза подряд, то произойдёт сброс комбинации
        if (movements[0].equals("right") && movements[1].equals("right") && movements[2].equals("right")) {
            this.reset();
            dialHistory[2] = dialPointer;
            movements[2] = "right";
        }
    }
    public void turnLeft(int ticks) {
        dialHistory[0] = dialHistory[1];
        dialHistory[1] = dialHistory[2];
        dialPointer = (dialPointer + ticks) % 40;
        dialHistory[2] = dialPointer;
        while (ticks > 1) {
            movements[0] = movements[1];
            movements[1] = movements[2];
            movements[2] = "left";
            ticks /= 40;
        }
        if (movements[0].equals("left") && movements[1].equals("left") && movements[2].equals("left")) {
            this.reset();
            dialHistory[2] = dialPointer;
            movements[2] = "left";
        }
    }
    public boolean open() {
        if (movements[0].equals("right") && dialHistory[0] == secret1
                && movements[1].equals("left") && dialHistory[1] == secret1
                && movements[2].equals("right") && dialHistory[2] == secret3) {
            this.reset(); // Запираем замок сразу после открытия, чтобы можно было потом тестить удобнее
            return true;
        }
        return false;
    }
}
