package salary;

import java.util.Date;

public class barangKeluar {
    private int kodeBarangKeluar;
    private barang barang;
    private int jumlah;
    private Date tanggalKeluar;

    barangKeluar(int kodeBarangKeluar, barang barang, int jumlah, Date tanggalKeluar) {
        this.kodeBarangKeluar = kodeBarangKeluar;
        this.barang = barang;
        this.jumlah = jumlah;
        this.tanggalKeluar = tanggalKeluar;
    }

    public barangKeluar() {
        
    }

    public int getKodeBarangKeluar() {
        return kodeBarangKeluar;
    }

    public void setKodeBarangKeluar(int kodeBarangKeluar) {
        this.kodeBarangKeluar = kodeBarangKeluar;
    }

    public barang getBarang() {
        return barang;
    }

    public void setBarang(barang barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(Date tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }
}
