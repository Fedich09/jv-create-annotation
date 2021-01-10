package core;

import core.controller.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        System.out.println("Input your value and risk for your bet");
        consoleHandler.handle();
    }
}
