public class ongkirBerat extends hargaOngkir{
    double m;

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }


    public double hargaberat(){
            double hrgbrt = Math.ceil((m / minbrt) - 1.0) * ongkirmin;
            return hrgbrt;
    }
}
