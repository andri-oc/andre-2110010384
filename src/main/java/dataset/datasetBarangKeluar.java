package dataset;

import java.util.ArrayList;

public class datasetBarangKeluar {

    private ArrayList<Integer> noKeluar;
    private ArrayList<Integer> tanggal;
    private ArrayList<Integer> kodeBarang;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> total;
    private ArrayList<String> tujuan;
    private ArrayList<String> username;

    public datasetBarangKeluar() {
        noKeluar = new ArrayList<Integer>();
        tanggal = new ArrayList<Integer>();
        kodeBarang = new ArrayList<Integer>();
        jumlah = new ArrayList<Integer>();
        total = new ArrayList<Integer>();
        tujuan = new ArrayList<String>();
        username = new ArrayList<String>();

    }
//    ===NO KELUAR===
    public void insertNoKeluar (int isi){
        this.noKeluar.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoKeluar(){
        return this.noKeluar;
    }
//    ===TANGGAL===
    public void insertTanggal (int isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<Integer> getRecordTanggal(){
        return this.tanggal;
    }
//    ===KODE BARANG===
    public void insertKodeBarang (int isi) {
        this.kodeBarang.add(isi);
    }
    
    public ArrayList<Integer> getRecordKodeBarang(){
        return this.kodeBarang;
    }
           
//    ===JUMLAH===
    public void insertJumlah (int isi) {
        this.jumlah.add(isi);       
    }
    
    public ArrayList<Integer> getRecordJumlah(){
        return this.jumlah;
    }
//    ===TOTAL===
    public void insertTotal(int isi){
        this.total.add(isi);
    }
    
    public ArrayList<Integer> getRecordTotal(){
        return this.total;
    }
    
//    ===TUJUAN===
    public void insertTujuan(String isi){
        this.tujuan.add(isi);
    }
    
    public ArrayList<String> getRecordTujuan(){
        return this.tujuan; 
    }
//    ===USERNAME===
    
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    
    public ArrayList<String> getRecordUsername(){
        return this.username; 
    }
    
    
    public void insertBarangKeluar (int noKeluar, int tanggal, int kodeBarang, int jumlah, int total, String tujuan, String username){
        this.noKeluar.add(noKeluar);
        this.tanggal.add(tanggal);
        this.kodeBarang.add(kodeBarang);
        this.jumlah.add(jumlah);
        this.total.add(total);
        this.tujuan.add(tujuan);
        this.username.add(username);                                              
    }
}
