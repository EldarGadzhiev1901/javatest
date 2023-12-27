public class Drink extends Product{

    double volume;
    double t;

    public Drink(String name, int cost, int volume, int t) {
        super(name, cost);
        this.volume = volume;
        this.t = t;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f, t: %f ", this.volume, this.t);
    }
}
