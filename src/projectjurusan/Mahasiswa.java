package projectjurusan;

/**
 *
 * @author fachr
 */
public class Mahasiswa {
    
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }                
    
}
