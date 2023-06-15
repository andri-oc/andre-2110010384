/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dataset;

import java.util.ArrayList;



public class datasetBarangMasuk {

    private ArrayList<Integer> noMasuk;
    private ArrayList<Integer> tanggal;
    private ArrayList<String> kodeBarang;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> total;
    private ArrayList<String> kodeSuplier;
    private ArrayList<String> username;

    //    ===NO KELUAR===
    public void insertNoMasuk(int isi) {
        this.noMasuk.add(isi);
    }

    public ArrayList<Integer> getRecordNoMasuk() {
        return this.noMasuk;
    }

    //    ===TANGGAL===
    public void insertTanggal(int isi) {
        this.tanggal.add(isi);
    }

    public ArrayList<Integer> getRecordTanggal() {
        return this.tanggal;
    }

    //    ===KODE BARANG===
    public void insertKodeBarang(String isi) {
        this.kodeBarang.add(isi);
    }

    public ArrayList<String> getRecordKodeBarang() {
        return this.kodeBarang;
    }

    //    ===JUMLAH===
    public void insertJumlah(int isi) {
        this.jumlah.add(isi);
    }

    public ArrayList<Integer> getRecordJumlah() {
        return this.jumlah;
    }
//    ===TOTAL===

    public void insertTotal(int isi) {
        this.total.add(isi);
    }

    public ArrayList<Integer> getRecordTotal() {
        return this.total;
    }

//    ===KODE SUPLIER===
    public void insertKodeSuplier(String isi) {
        this.kodeSuplier.add(isi);
    }

    public ArrayList<String> getRecordKodeSuplier() {
        return this.kodeSuplier;
    }

    //    ===USERNAME===
    public void insertUsername(String isi) {
        this.username.add(isi);
    }

    public ArrayList<String> getRecordUsername() {
        return this.username;
    }
    
    public void insertBarangMasuk (int noMasuk, int tanggal, String kodeBarang, int jumlah, int total, String kodeSuplier, String username){
        this.noMasuk.add(noMasuk);
        this.tanggal.add(tanggal);
        this.kodeBarang.add(kodeBarang);
        this.jumlah.add(jumlah);
        this.total.add(total);
        this.kodeSuplier.add(kodeSuplier);
        this.username.add(username);
                
    }
   
}
