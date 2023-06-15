package dataset;

import java.util.ArrayList;

public class datasetSupplier {

//kode suplier, nama supplier, alamat, telp, kode pos
    private ArrayList<String> kodeSupplier;
    private ArrayList<String> namaSupplier;
    private ArrayList<String> alamat;
    private ArrayList<Integer> telp;
    private ArrayList<Integer> kodePos;

    public datasetSupplier() {
        kodeSupplier = new ArrayList<String>();
        namaSupplier = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telp = new ArrayList<Integer>();
        kodePos = new ArrayList<Integer>();
    }

//    KODE SUPPLIER
    public void insertKodeSupplier(String isi) {
        this.kodeSupplier.add(isi);
    }

    public ArrayList<String> getRecordKodeSuplier() {
        return this.kodeSupplier;
    }

//    NAMA SUPPLIER
    public void insertNamaSupplier(String isi) {
        this.namaSupplier.add(isi);
    }

    public ArrayList<String> getRecordNamaSupplier() {
        return this.namaSupplier;
    }
//    ALAMAT

    public void insertAlamat(String isi) {
        this.alamat.add(isi);
    }

    public ArrayList<String> getRecordAlamat() {
        return this.alamat;
    }
//    TELP

    public void insertTelp(int isi) {
        this.telp.add(isi);
    }

    public ArrayList<Integer> getRecordTelp() {
        return this.telp;
    }
//    KODE POS

    public void insertKodePos(int isi) {
        this.kodePos.add(isi);
    }

    public ArrayList<Integer> getRecordKodePos() {
        return this.kodePos;
    }
    
    public void insertSupplier (String kodeSupplier, String namaSupplier, String alamat, int telp, int kodePos){
        this.kodeSupplier.add(kodeSupplier);
        this.namaSupplier.add(namaSupplier);
        this.alamat.add(alamat);
        this.telp.add(telp);
        this.kodePos.add(kodePos);
    }

}
