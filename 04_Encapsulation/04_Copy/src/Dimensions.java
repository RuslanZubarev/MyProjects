public class Dimensions {
    private final int width;
    private final int hight;
    private final int length;

    public Dimensions(int width, int hight, int length) {
        this.width = width;
        this.hight = hight;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public int getLength() {
        return length;
    }

    public void calculateVolumeOfCargo() {
        int volumeOfCargo = width * hight * length;
    }
}
