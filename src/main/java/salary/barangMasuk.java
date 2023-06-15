package salary;

import java.util.Date;

public class barangMasuk{
    private int noBarangMasuk;
    private barang barang;
    private supplier supplier;
    private int jumlah;
    private Date tanggalMasuk;
    // private int total;

    // construcktor Barang Masuk
    barangMasuk(int noBarangMasuk,barang barang, supplier supplier, int jumlah, Date tanggalMasuk) {
        this.noBarangMasuk = noBarangMasuk;
        this.barang = barang;
        this.supplier = supplier;
        this.jumlah += jumlah;
        this.tanggalMasuk = tanggalMasuk;
    }

    public barangMasuk() {
    }

    // Method get dan set barang masuk
    public int getBarangMasuk() {
        return noBarangMasuk;
    }

    public void setBarangMasuk(int noBarangMasuk) {
        this.noBarangMasuk = noBarangMasuk;
    }

    // method set dan get barang
    public barang getBarang() {
        return barang;
    }

    public void setBarang(barang barang) {
        this.barang = barang;
    }

    // method set dan get supplier
    public supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(supplier supplier) {
        this.supplier = supplier;
    }

    // method set dan get jumlah
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    // method set tangal masuk
    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
}
