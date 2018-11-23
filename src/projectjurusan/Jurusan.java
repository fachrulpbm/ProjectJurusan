package projectjurusan;

import java.util.ArrayList;

/**
 *
 * @author fachr
 */
public class Jurusan {
    
    private String namaJurusan;
    ArrayList<Mahasiswa> listMhs = new ArrayList<>();
    Mahasiswa mhs;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
    
    public void addMahasiswa(String nim, String nama){
        mhs = new Mahasiswa(nim, nama);
        listMhs.add(mhs);
    }
    
    public void showAllMahasiswa(){
        System.out.println(namaJurusan);
        for (Mahasiswa m : listMhs) {
            System.out.println(m.getNim()+" "+m.getNama());
        }
    }
    
    public int searchMahasiswa(String nim){
        for(int i=0; i<listMhs.size(); i++){
            if ( listMhs.get(i).getNim() == nim ) {
                return i;
            }
        }
        return -1;
    }
    
    public void updateMahasiswa(int index, String nama){
        listMhs.get(index).setNama(nama);        
    }
    
    public void deleteMahasiswa(int index){
        try {
            listMhs.remove(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index tidak ditemukan: "+e.getMessage());
        }        
    }
    
    
    
}
