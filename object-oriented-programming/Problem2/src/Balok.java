public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double volume(){
        double v = panjang * lebar * tinggi;
        return v;
    }
}
