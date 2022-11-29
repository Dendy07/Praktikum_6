public class segitiga {
    private int alas;
    private int tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void segitiga(alas tinggi) {
        System.out.println("segitiga(alas,tinggi)");
    }

    @Override
    public float luas() {
        System.out.println("luas segitiga");
    }

    @Override
    public void gambar() {
        System.out.println("gambar segitiga");
    }

    @Override
    public float getAreas() {
        return this.alas * this.tinggi;
    }
}