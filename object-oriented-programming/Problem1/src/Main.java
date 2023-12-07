import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String y;
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan sisi persegi : ");
            double s = input.nextDouble();
            Persegi persegi1 = new Persegi(s);
            System.out.println("Luas Persegi 1 = "+ persegi1.luaspersegi());
            System.out.println("Keliling Persegi 1 = " + persegi1.kelilingpersegi());
            System.out.println();

            System.out.print("Masukkan alas segitiga : ");
            double a = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga : ");
            double t = input.nextDouble();
            Segitiga segitiga1 = new Segitiga(a,t);
            System.out.println("Luas Segitiga 1 = " + segitiga1.luassegitiga());
            System.out.println("Keliling Segitiga 1 = " + segitiga1.kelilingsegitiga());
            System.out.println();

            System.out.print("Masukkan panjang persegi panjang : ");
            double p = input.nextDouble();
            System.out.print("Masukkan lebar persegi panjang : ");
            double l = input.nextDouble();
            PersegiPanjang segipanjang1 = new PersegiPanjang(p,l);
            System.out.println("Luas Persegi Panjang 1 = " + segipanjang1.luaspersegipanjang());
            System.out.println("Keliling Persegi Panjang 1 = " + segipanjang1.kelilingpersegipanjang());
            System.out.println();

            System.out.println("lakukan perhitungan lagi? (Y / N)");
            input.nextLine();
            y = input.nextLine();

            System.out.println();
            System.out.println("======================================");

        } while (y.equalsIgnoreCase("Y"));

    }
}