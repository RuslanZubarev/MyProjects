package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxFloor = 26;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor >= minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(" Опускаемся на этаж №: " + currentFloor);
    }

    public void moveUp() {

        currentFloor = currentFloor <= maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(" Поднимаемся на этаж №: " + currentFloor);

    }

    public void move(int floor) {

        if (floor > minFloor || floor < maxFloor) {
            currentFloor = currentFloor + floor;
            currentFloor = currentFloor - floor;
            System.out.println("Выбран этаж № - " + floor);
        } else {
            System.out.println("Этаж выбран неверно.");
        }

        if (floor > currentFloor) {
            while (currentFloor < floor && currentFloor < maxFloor) {
                moveUp();
            }
            System.out.println(" Этаж №: " + currentFloor);
            floor = floor + 1;
        } else {
            while (currentFloor > floor && currentFloor > minFloor) {
                moveDown();
                System.out.println(" Этаж №: " + currentFloor);
                floor = floor - 1;
            }
        }
    }
}