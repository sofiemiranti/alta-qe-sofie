import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        hargaOngkir barang1 = new hargaOngkir();
        barang1.setOngkirmin(5000);

        System.out.print("Masukkan panjang (cm) : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (cm) : ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi (cm) : ");
        double tinggi = input.nextDouble();
        System.out.println("_____________________________________");
        System.out.print("Masukkan berat (kg) : ");
        double beratbarang = input.nextDouble();
        ongkirVolume vol_barang1 = new ongkirVolume();
        ongkirBerat mas_barang1 = new ongkirBerat();
        vol_barang1.setP(panjang);
        vol_barang1.setL(lebar);
        vol_barang1.setT(tinggi);
        mas_barang1.setM(beratbarang);

        vol_barang1.setMinvol(50);
        vol_barang1.setOngkirmin(5000);
        mas_barang1.setMinbrt(1);
        mas_barang1.setOngkirmin(5000);
        double hrgongkirtotal = barang1.getOngkirmin() + vol_barang1.hargavolume() + mas_barang1.hargaberat();
        System.out.println("______________________________________");
        System.out.println("Total Ongkir = Rp "  + hrgongkirtotal);
    }
}