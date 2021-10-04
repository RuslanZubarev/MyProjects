package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxFloor = 26;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor >= minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor <= maxFloor ? currentFloor + 1 : currentFloor;

    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Этаж выбран неверно.");
            return;
        } else if (floor == currentFloor) {

            System.out.println("Мы находимся на этом этаже");
        }

        while (currentFloor != floor) {
            // Если текущий этаж выше заданного - ехать вниз (moveDown)
            if (currentFloor > floor) {
                moveDown();
            }
            // Если текущий этаэ ниже заданного - ехать вверх (moveUp)
            else if (currentFloor < floor) {
                moveUp();
            }
            // Вывести текущий этаж на консоль
            System.out.println(currentFloor);
        }
    }
}


