// Nama :Muhammad Shabran
// Nim  :13020220056
//kelas :A2
//Konversi Waktu


import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Detik : ");
        long totalDetik = input.nextLong();
        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

        System.out.println("Tampil Waktu : "+ jamSekarang+ ":"+ menitSekarang +":"+ detikSekarang);
    }
}