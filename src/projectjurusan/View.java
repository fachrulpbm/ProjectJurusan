package projectjurusan;

/**
 *
 * @author fachr
 */
public class View {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jurusan ti = new Jurusan("Teknik Informatika");
        ti.addMahasiswa("001", "Udin");
        ti.addMahasiswa("002", "Joko");
        ti.showAllMahasiswa();                
        
        int ke = ti.searchMahasiswa("002");
        
        ti.updateMahasiswa(ke, "Broto");
        ti.showAllMahasiswa();
                
        int temp = ti.searchMahasiswa("009");
        ti.deleteMahasiswa( temp );
        ti.showAllMahasiswa();
        
        System.out.println("Hallo 2C");
        
        
    }
    
}



















//System.out.println("");
//        
//        Jurusan tm = new Jurusan("Teknik Mesin");
//        tm.addMahasiswa("003", "Ipul");
//        tm.addMahasiswa("004", "Tatang");
//        tm.showAllMahasiswa();
