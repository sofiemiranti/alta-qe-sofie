public class Kubus {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double volume(){
        double v;
        v = sisi * sisi * sisi;
        return v;
    }

}
