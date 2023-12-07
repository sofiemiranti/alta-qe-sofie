public class ongkirVolume extends hargaOngkir{
    double p, l, t;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double volumee(){
        double vol = p * l * t;
        return vol;
    }


    public double hargavolume(){
        double hrgvlm = Math.ceil((volumee() / minvol) - 1.0) * ongkirmin;
        return hrgvlm;
    }
}
