/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kalkulator1;

import java.util.List;
/**
 *
 * @author HP
 */
public interface OperasiMatematika {
    double penjumlahan(List<Double> angka);
    double pengurangan(List<Double> angka);
    double perkalian(List<Double> angka);
    double pembagian(List<Double> angka);
    double modulus(double a, double b);
    double pangkat(double a, double b);
}
