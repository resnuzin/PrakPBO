package TugasPPBO4;

public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    // Constructor
    public Manusia(String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    // Getter dan Setter untuk Nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}
