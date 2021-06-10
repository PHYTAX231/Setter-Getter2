public class SetGet {
    public static void main(String[] args) {
        Benda b1 = new Benda();
        b1.setNama("handphone");
        b1.setJenis("Zuxxy");
        b1.setJumlah(2);
        b1.setHarga(2000000);
        b1.Show();
        
        System.out.println("Nama: " + b1.getNama());
        System.out.println("Jenis: " + b1.getJenis());
        System.out.println("Jumlah: " + b1.getJumlah());
        System.out.println("Harga: " + b1.getHarga());
        
        BendaGrosir bg1 = new BendaGrosir();
        BendaEceran be1 = new BendaEceran();
        
        bg1.setNama("Laptop");
        bg1.setJenis("Apel");
        bg1.setJumlah(1);
        bg1.setHarga(5000000);
        bg1.setDiskon(50);
        bg1.Show();
    }
}
