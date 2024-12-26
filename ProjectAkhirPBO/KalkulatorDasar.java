/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
abstract class KalkulatorDasar implements OperasiMatematika {
    protected List<String> logOperasi = new ArrayList<>();

    public double penjumlahan(List<Double> angka) {
        double hasil = 0;
        for (double num : angka) {
            hasil += num;
        }
        logOperasi.add("Penjumlahan: " + angka + " = " + hasil);
        return hasil;
    }

    public double pengurangan(List<Double> angka) {
        if (angka.isEmpty()) return 0;
        double hasil = angka.get(0);
        for (int i = 1; i < angka.size(); i++) {
            hasil -= angka.get(i);
        }
        logOperasi.add("Pengurangan: " + angka + " = " + hasil);
        return hasil;
    }

    public double perkalian(List<Double> angka) {
        if (angka.isEmpty()) return 1;
        double hasil = 1;
        for (double num : angka) {
            hasil *= num;
        }
        logOperasi.add("Perkalian: " + angka + " = " + hasil);
        return hasil;
    }

    public double pembagian(List<Double> angka) {
        if (angka.isEmpty()) return 0;
        double hasil = angka.get(0);
        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) == 0) {
                logOperasi.add("Pembagian: Error (pembagi tidak boleh nol)");
                throw new ArithmeticException("Pembagi tidak boleh nol");
            }
            hasil /= angka.get(i);
        }
        logOperasi.add("Pembagian: " + angka + " = " + hasil);
        return hasil;
    }

    public double modulus(double a, double b) {
        double hasil = a % b;
        logOperasi.add("Modulus: " + a + " % " + b + " = " + hasil);
        return hasil;
    }

    public double pangkat(double a, double b) {
        double hasil = Math.pow(a, b);
        logOperasi.add("Pangkat: " + a + "^" + b + " = " + hasil);
        return hasil;
    }

    public abstract void tampilkanLog();
}