public class BendaGrosir extends Benda {
    int diskon;

    public BendaGrosir() {
    }

    public BendaGrosir(int diskon) {
        this.diskon = diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getDiskon() {
        return diskon;
    }
    
    void Show(){
        System.out.println(getNama());
        System.out.println(getJenis());
        System.out.println(getJumlah());
        System.out.println(getHarga());
        System.out.println(getDiskon());
    }
    
    
}
