import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luassegitiga(){
        double luas = (alas * tinggi) / 2;
        return luas;
    }

    public double kelilingsegitiga(){
        double sisimiring = sqrt(pow(alas,2) + pow(tinggi,2));
        double keliling = alas + tinggi + sisimiring;
        return keliling;
    }
}
