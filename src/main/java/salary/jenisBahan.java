package salary;

public class jenisBahan {

    private String kodeJenis;
    private String namaJenis;

    jenisBahan(String kodeJenis, String namaJenis) {
        this.kodeJenis = kodeJenis;
        this.namaJenis = namaJenis;
    }

    public jenisBahan() {
    }

    public String getKodeJenis() {
        return kodeJenis;
    }

    public void setKodeJenis(String kodeJenis) {
        this.kodeJenis = kodeJenis;
    }
    
    public String getNamaJenis(){
        return namaJenis;
    }
    
    public void setNamaJenis(String namaJenis){
        this.namaJenis = namaJenis;
    }
    
}

