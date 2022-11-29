public class main {
    public static void main(String[] args) {
        // membuat objek Shape dari class persegi
        Shape persegi = new persegi(100, 200);

        // membuat objek Shape dari class segitiga
        Shape segitiga = new segitiga(40, 50);

        // membuat objek Shape dari class lingkaran
        Shape lingkaran = new lingkaran(50);

        /* memanggil method gambar */
        persegi.gambar();
        segitiga.gambar();
        lingkaran.gambar();

        System.out.println("Luas persegi: " + persegi.getAreas());
        System.out.println("Luas segitiga: " + segitiga.getAreas());
        System.out.println("Luas lingkaran: " + lingkaran.getAreas());
    }
}