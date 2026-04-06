import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan biaya makan: ");
        double makan = input.nextDouble();

        System.out.print("Masukkan biaya transport: ");
        double transport = input.nextDouble();

        System.out.print("Masukkan biaya belanja: ");
        double belanja = input.nextDouble();

        // Hitung total
        double total = makan + transport + belanja;

        // Hitung persentase
        double persenMakan = (makan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja = (belanja / total) * 100;

        // Output hasil
        System.out.println("\n=== HASIL ===");
        System.out.println("Total = " + makan + " + " + transport + " + " + belanja + " = " + total);

        System.out.println("\nPersentase:");
        System.out.println("Makan = (" + makan + " / " + total + ") x 100 = " + persenMakan + "%");
        System.out.println("Transport = (" + transport + " / " + total + ") x 100 = " + persenTransport + "%");
        System.out.println("Belanja = (" + belanja + " / " + total + ") x 100 = " + persenBelanja + "%");

        input.close();
    }
}
