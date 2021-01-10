package core.controller;

import core.dao.BetDao;
import core.dao.GainDao;
import core.lib.Inject;
import core.model.Bet;
import core.model.Gain;

import java.util.Scanner;

public class ConsoleHandler {
    @Inject
    private BetDao betDao;
    @Inject
    private GainDao gainDao;

    public void handle() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                return;
            }
            Gain gain = null;
            Bet bet = null;
            try {
                String[] strings = input.split(" ");
                int inputBet = Integer.parseInt(strings[0]);
                double inputRisk = Double.parseDouble(strings[1]);
                bet = new Bet(inputBet, inputRisk);
                gain = new Gain(inputBet * inputRisk);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Input correct data, please");
            }
            if (bet != null && gain != null) {
                betDao.add(bet);
                gainDao.add(gain);
                System.out.println(bet + ", " + gain);
            }
        }
    }
}
