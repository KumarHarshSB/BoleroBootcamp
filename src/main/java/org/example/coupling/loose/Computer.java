package org.example.coupling.loose;

public class Computer {
    // We are passing Keyboard and not DellKeyboard
    // Computer is not depending on DellKeyboard and LenovoKeyboard classes
    public void keyboardUsed(Keyboard keyboard) {
        System.out.println("Computer is using : " + keyboard.display());
    }
}