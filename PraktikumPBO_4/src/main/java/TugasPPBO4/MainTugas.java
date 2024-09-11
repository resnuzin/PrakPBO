package TugasPPBO4;

public class MainTugas {
    public static void main(String[] args) {
        Pekerja Arbeitnehmer = new Pekerja("Resnu", 19, "Ternak Lele", 270000000);
        
        System.out.println("Informasi Pekerja :");
        System.out.println(Arbeitnehmer.toString());
        
        Arbeitnehmer.setNama("IsmaiL");
        
        System.out.println("\nInformasi Pekerja :");
        System.out.println(Arbeitnehmer.toString());
        
        System.out.println(Arbeitnehmer.usia);
    }
    
}
