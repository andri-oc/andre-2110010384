
package dataset;

import java.util.ArrayList;

public class datasetJenisBahan {

    private ArrayList<String> kodejenis;
    private ArrayList<String> namaJenis;

    
    public datasetJenisBahan(){        
        kodejenis = new ArrayList<String>();
        namaJenis = new ArrayList<String>();
    }
   
       
//        KODE JENIS
        public void insertKodeJenis(String isi){
            this.kodejenis.add(isi);
        }
        
        public ArrayList<String> getRecordKodeJenis(){
            return this.kodejenis;
        }
        
//        NAMA JENIS
        public void insertNamaJenis(String isi) {
            this.namaJenis.add(isi);
        }
        
        public ArrayList<String> getRecordNamaJenis(){
            return this.namaJenis;
        }
        
        public void insertJenisBahan (String kodeJenis, String namajenis) {
            this.kodejenis.add(namajenis);
            this.namaJenis.add(namajenis);
        }
}
        
