public class PersegiPanjang {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luaspersegipanjang(){
        double luas = panjang * lebar;
        return luas;
    }

    public double kelilingpersegipanjang(){
        double luas = (2 * panjang) + (2 * lebar);
        return luas;
    }
}
