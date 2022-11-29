import java.lang.Math;

public class lingkaran extends Shape {
    private int radius;

    public lingkaran(int radius) {
        this.radius = radius;
    }

    @Override
    public void lingkaran() {
        System.out.println("lingkaran(r)");
    }

    @Override
    public float luas() {
        System.out.println("luas lingkaran");
    }

    @Override
    public void gambar() {
        System.out.println("gambar lingkaran");
    }

    @Override
    public float getAreas() {
        return (float) (Math.PI * radius * radius);
    }
}