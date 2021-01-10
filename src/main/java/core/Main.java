package core;

import core.controller.ConsoleHandler;
import core.lib.Injector;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler consoleHandler = (ConsoleHandler) Injector.getInstance(ConsoleHandler.class);
        System.out.println("Input your value and risk for your bet");
        consoleHandler.handle();
    }
}
