package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan Objek Buku ke File Serialisasi");
            System.out.println("3. Tampilkan Daftar Buku dari File Teks");
            System.out.println("4. Tampilkan Daftar Buku dari File Serialisasi");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileSerial();
                case 3 -> bacaDariFileTeks();
                case 4 -> bacaDariFileSerial();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        daftarBuku.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan.");
    
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek buku berhasil disimpan ke file serialisasi.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serialisasi.");
            e.printStackTrace();
        }
    }

    private static void bacaDariFileTeks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            System.out.println("Daftar Buku dari File Teks:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }
    
    private static void bacaDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuList = (List<Buku>) ois.readObject();
            System.out.println("Daftar Buku dari File Serialisasi:");
            for (Buku buku : bukuList) {
                buku.tampilkanInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serialisasi.");
            e.printStackTrace();
        }
    }
}
