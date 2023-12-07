import static java.lang.Math.pow;

public class Tabung {
    double r;
    double t;

    public Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    public double volume(){
        double phi = 3.14159;
        double v = phi * pow(r,2) * t;
        return v;
    }
}
