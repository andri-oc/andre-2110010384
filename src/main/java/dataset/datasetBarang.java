package dataset;

import java.util.ArrayList;

public class datasetBarang {

    private ArrayList<String> kodeBarang;
    private ArrayList<String> namaBarang;
    private ArrayList<Integer> hargaBeli;
    private ArrayList<Integer> harga;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> kodeJenis;

    public datasetBarang() {
        kodeBarang = new ArrayList<String>();
        namaBarang = new ArrayList<String>();
        hargaBeli = new ArrayList<Integer>();
        harga = new ArrayList<Integer>();
        jumlah = new ArrayList<Integer>();
        kodeJenis = new ArrayList<Integer>();

    }
    
//    ===KODE BARANG===
    public void insertKodeBarang(String isi) {
        this.kodeBarang.add(isi);
    }
    
    public ArrayList<String> getRecordKodeBarang(){
        return this.kodeBarang;
    }
    
//    ===NAMA BARANG===
    public void insertNamaBarang (String isi) {
        this.namaBarang.add(isi);
    }
    
    public ArrayList<String> getRecordNamaBarang(){
        return this.namaBarang;
    }
    
//    ===HARGA BELI===
    public void insertHargaBeli(int isi) {
        this.hargaBeli.add(isi);
    }
    
    public ArrayList<Integer> getRecordHargaBeli(){
        return this.hargaBeli;
    }
    
//    ===HARGA===
    public void insertHarga(int isi){
        this.harga.add(isi);
    }
    
    public ArrayList<Integer> getRecordHarga(){
        return this.harga;
    }   
//    ===JUMLAH===
    public void insertJumlah (int isi) {
        this.jumlah.add(isi);
    }
    
    public ArrayList<Integer> getRecordJumlah (){
        return this.jumlah;
    }
//    ===KODE JENIS
    public void insertKodeJenis(int isi) {
        this.kodeJenis.add(isi);
    }
    
    public ArrayList<Integer> getRecordKodeJenis(){
        return this.kodeJenis;
    }
    
    
    public void insertBarang (String kodeBarang, String namaBarang, int hargaBeli, int harga, int jumlah, int kodeJenis){
        this.kodeBarang.add(kodeBarang);
        this.namaBarang.add(namaBarang);
        this.hargaBeli.add(hargaBeli);
        this.harga.add(harga);
        this.jumlah.add(jumlah);
        this.kodeJenis.add(kodeJenis);        
    }
}
