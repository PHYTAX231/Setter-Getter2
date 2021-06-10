public class Benda {
    private String nama;
    private String jenis;
    private int jumlah;
    private long harga;

    public Benda() {
    }

    public Benda(String nama, String jenis, int jumlah, long harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public long getHarga() {
        return harga;
    }
    
    void Show(){
        System.out.println(getNama());
        System.out.println(getJenis());
        System.out.println(getJumlah());
        System.out.println(getHarga());
    }
    
    
}
