import java.util.Scanner;

public class tugas1juga {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tipe mobil BMW
        String[] tipe = {"BMW X1", "BMW X3", "BMW X5"};
        
        // Array untuk menyimpan total penjualan tiap tipe
        double[] totalTipe = new double[3];
        
        double totalSemua = 0;

        // Input data selama 7 hari
        for (int i = 1; i <= 7; i++) {
            System.out.println("\nHari ke-" + i);

            for (int j = 0; j < tipe.length; j++) {
                System.out.print("Masukkan penjualan " + tipe[j] + ": ");
                double jumlah = input.nextDouble();

                totalTipe[j] += jumlah;
                totalSemua += jumlah;
            }
        }

        // Output hasil
        System.out.println("\n=== HASIL PENJUALAN SELAMA 1 MINGGU ===");

        for (int i = 0; i < tipe.length; i++) {
            double persen = (totalTipe[i] / totalSemua) * 100;

            System.out.println(tipe[i] + " = " + totalTipe[i] + 
                " unit (" + persen + "%)");
        }

        System.out.println("\nTotal Semua Penjualan = " + totalSemua + " unit");

        input.close();
    }
}
