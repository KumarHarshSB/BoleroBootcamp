package org.example.coupling.loose;

public class Driver {
    public static void main(String[] args) {
        Computer computer = new Computer();
        DellKeyboard dk = new DellKeyboard();
        LenovoKeyboard lk = new LenovoKeyboard();
        computer.keyboardUsed(dk);
        computer.keyboardUsed(lk);
    }
}
