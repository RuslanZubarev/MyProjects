package ru.skillbox;

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

    public Dimensions setWidth(int width){
        return new Dimensions(width, hight, length);
    }

    public int getHight() {
        return hight;
    }

    public Dimensions setHight(int hight){
        return new Dimensions(width, hight, length);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLenght(int length){
        return new Dimensions(width, hight, length);
    }

    public void calculateVolumeOfCargo() {
        int volumeOfCargo = width * hight * length;
    }

    public String toSting() {
        return "Ширина:" + width + "\n" +
                "Высота:" + hight + "\n" +
                "Длинна:" + length;
    }
}
