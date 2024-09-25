import java.util.Scanner;
import java.lang.Math;

public class tugas2 {

    // menghitung persegi
    public static void hitungPersegi (Scanner scanner) {
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi " + keliling);
    }

    // menghitung persegi panjang
    public static void hitungPersegiPanjang(Scanner scanner) {
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }

    // menghitung lingkaran
    public static void hitungLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari Lingkaran: ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan anda: ");


        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungPersegi(scanner);
                break;
            case 2:
                hitungPersegiPanjang(scanner);
                break;
            case 3:
                hitungLingkaran(scanner);
                break;
            default:
                System.out.println("Pilihan tidak sesuai.");
        }
    }
}
