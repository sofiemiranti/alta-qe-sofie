public class Persegi {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luaspersegi(){
        double luas = sisi * sisi;
        return luas;
    }

    public double kelilingpersegi(){
        double keliling = 4 * sisi;
        return keliling;
    }
}
