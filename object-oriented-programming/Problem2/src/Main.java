import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String y;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menghitung Volume Kubus");
            System.out.print("Masukkan panjang sisi kubus : ");
            double s = input.nextDouble();
            Kubus kubus1 = new Kubus(s);
            System.out.println("Volume kubus adalah " + kubus1.volume());
            System.out.println();

            System.out.println("Menghitung Volume Balok");
            System.out.print("Masukkan panjang balok : ");
            double p = input.nextDouble();
            System.out.print("Masukkan lebar balok : ");
            double l = input.nextDouble();
            System.out.print("Masukkan tinggi balok : ");
            double t = input.nextDouble();
            Balok balok1 = new Balok(p, l, t);
            System.out.println("Volume balok adalah " + balok1.volume());
            System.out.println();

            System.out.println("Menghitung Volume Tabung");
            System.out.print("Masukkan jari-jari tabung : ");
            double jari = input.nextDouble();
            System.out.print("Masukkan tinggi tabung : ");
            double tinggi = input.nextDouble();
            Tabung tabung1 = new Tabung(jari, tinggi);
            System.out.println("Volume tabung adalah " + tabung1.volume());
            System.out.println();

            System.out.println("Lakukan Perhitungan Kembali? (Y / N)");
            y = input.next();
        } while (y.equals("Y"));
    }
}