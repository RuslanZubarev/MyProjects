package ru.skillbox;

public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width, height, length);
    }

    public int getHeight(int i) {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(width, height, length);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLenght(int length) {
        return new Dimensions(width, height, length);
    }


    public int calculateVolume() {
        return  width * height * length;
    }

    public String toString() {
        return "Ширина:" + width + "\n" +
                "Высота:" + height + "\n" +
                "Длинна:" + length;
    }
}

