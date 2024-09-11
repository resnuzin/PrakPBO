package TugasPPBO4;

public class Pekerja extends Manusia{
    private int gaji;
     
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    @Override
    public String toString(){
        return"Nama " + getNama() + " Berusia " + usia + " Tahun, "
                + "Bekerja sebagai " + pekerjaan + " Memiliki Gaji Rp." + gaji;
    }
}
