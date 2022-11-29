public class persegi {
    private float panjang;
    private float lebar;

    public persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void persegi(panjang lebar) {
        System.out.println("panjang,lebar persegi");
    }

    @Override
    public float luas() {
        System.out.println("luas persegi");
    }

    @Override
    public void gambar() {
        System.out.println("gambar persegi");
    }

    @Override
    public float getAreas() {
        return this.panjang * this.lebar;
    }
}