import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        String y;
        do{
            System.out.print("Masukkan Nilai Mahasiswa \t: ");
            int nilai = inputan.nextInt();
            String indeks = "";

            if(nilai < 0 || nilai > 100){
                indeks = "invalid";
            } else if(nilai >= 80 && nilai <= 100){
                indeks = "A";
            } else if(nilai >= 65 && nilai <= 79){
                indeks = "B+";
            } else if(nilai >= 50 && nilai <= 64){
                indeks = "B";
            } else if(nilai >= 35 && nilai <= 49){
                indeks = "C";
            } else if(nilai >= 0 && nilai <= 34) {
                indeks = "D";
            }

            System.out.println("Indeks Mahasiswa \t\t\t: " + indeks);


            System.out.println("Lanjutkan Program? (Y / N)");
            inputan.nextLine();
            y = inputan.nextLine();

            System.out.println();
            System.out.println("================================");
        } while (!y.equalsIgnoreCase("N"));

    }
}