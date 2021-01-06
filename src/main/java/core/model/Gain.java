package core.model;

public class Gain {
    private int gain;

    public Gain(int gain) {
        this.gain = gain;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    @Override
    public String toString() {
        return "Gain{" + "gain=" + gain + '}';
    }
}
