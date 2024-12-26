/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProjectPBO_Akhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        User user = new User(nama);
        user.gunakanKalkulator();
    }
}
