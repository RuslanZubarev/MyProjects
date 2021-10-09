public class Dimensions {
    private final int width;
    private final int hight;
    private final int lenght;

    public Dimensions(int width, int hight, int lenght) {
        this.width = width;
        this.hight = hight;
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public int getLenght() {
        return lenght;
    }

    public void calculateVolumeOfCargo() {
        int volumeOfCargo = width * hight * lenght;
    }
}
