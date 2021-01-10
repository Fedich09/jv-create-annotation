package core.model;

public class Gain {
    private double gain;

    public Gain(double gain) {
        this.gain = gain;
    }

    public double getGain() {
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
