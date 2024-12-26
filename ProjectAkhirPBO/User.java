/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator1;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class User {
    private String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void gunakanKalkulator() {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang, " + nama + "!");

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            System.out.println("6. Pangkat");
            System.out.println("7. Hitung IPK");
            System.out.println("8. Tampilkan Log");
            System.out.println("9. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 9) {
                selesai = true;
                break;
            }

            if (pilihan >= 1 && pilihan <= 6) {
                if (pilihan == 5 || pilihan == 6) {
                    System.out.print("Masukkan angka pertama: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b = scanner.nextDouble();

                    double hasil = (pilihan == 5) ? kalkulator.modulus(a, b) : kalkulator.pangkat(a, b);
                    System.out.println("Hasil: " + hasil);
                } else {
                    List<Double> angka = kalkulator.inputAngka();
                    if (angka.isEmpty()) {
                        System.out.println("Tidak ada angka yang dimasukkan!");
                        continue;
                    }

                    double hasil = 0;
                    switch (pilihan) {
                        case 1:
                            hasil = kalkulator.penjumlahan(angka);
                            break;
                        case 2:
                            hasil = kalkulator.pengurangan(angka);
                            break;
                        case 3:
                            hasil = kalkulator.perkalian(angka);
                            break;
                        case 4:
                            hasil = kalkulator.pembagian(angka);
                            break;
                    }
                    System.out.println("Hasil: " + hasil);
                }
            } else if (pilihan == 7) {
                kalkulator.hitungIPK();
            } else if (pilihan == 8) {
                kalkulator.tampilkanLog();
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}