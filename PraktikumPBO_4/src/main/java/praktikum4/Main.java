package praktikum4;

public class Main {
    public static void main(String[] args) {
        Mobil Resnu = new Mobil("Zenix", 560, "AT", 5);
        Resnu.tampilkanInfoMobil();
        Resnu.tampilkanInfoKendaraan();
        
        
        Kendaraan mobilResnu = new Kendaraan("Mazda 3 HatchBack", 1000, "CVT");
        mobilResnu.tampilkanInfoKendaraan();
    }
    
}
