/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class Kalkulator extends KalkulatorDasar {
    
    @Override
    public void tampilkanLog() {
        System.out.println("\nLog Operasi:");
        for (String log : logOperasi) {
            System.out.println(log);
        }
    }
    // Fitur tambahan: Menghitung IPK
    public void hitungIPK() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        double totalSKS = 0;
        double totalBobot = 0;

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Masukkan jumlah SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Masukkan nilai (A, B, C, D, E): ");
            char nilai = scanner.next().toUpperCase().charAt(0);

            double bobotNilai;
            switch (nilai) {
                case 'A':
                    bobotNilai = 4.0;
                    break;
                case 'B':
                    bobotNilai = 3.0;
                    break;
                case 'C':
                    bobotNilai = 2.0;
                    break;
                case 'D':
                    bobotNilai = 1.0;
                    break;
                case 'E':
                    bobotNilai = 0.0;
                    break;
                default:
                    System.out.println("Nilai tidak valid, masukkan A, B, C, D, atau E.");
                    i--; // Ulangi input untuk mata kuliah ini
                    continue;
            }

            totalSKS += sks;
            totalBobot += bobotNilai * sks;
        }

        double ipk = totalBobot / totalSKS;
        System.out.println("\nTotal SKS: " + totalSKS);
        System.out.println("Total Bobot: " + totalBobot);
        System.out.printf("IPK Anda adalah: %.2f\n", ipk);

        logOperasi.add("Perhitungan IPK: Total SKS = " + totalSKS + ", Total Bobot = " + totalBobot + ", IPK = " + ipk);
    }

    public List<Double> inputAngka() {
        Scanner scanner = new Scanner(System.in);
        List<Double> angka = new ArrayList<>();
        boolean selesai = false;

        System.out.println("Masukkan angka satu per satu (ketik 'selesai' untuk berhenti):");

        while (!selesai) {
            System.out.print("Masukkan angka: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("selesai")) {
                selesai = true;
            } else {
                try {
                    double num = Double.parseDouble(input);
                    angka.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka atau ketik 'selesai'.");
                }
            }
        }
        return angka;
    }
}