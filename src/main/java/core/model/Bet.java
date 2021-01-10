package core.model;

public class Bet {
    public int bet;
    public double risk;

    public Bet(int bet, double risk) {
        this.bet = bet;
        this.risk = risk;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "Bet{"
                + "bet=" + bet
                + ", risk=" + risk
                + '}';
    }
}
