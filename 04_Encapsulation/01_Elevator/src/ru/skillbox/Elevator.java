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
/** Мысль по реализации этого метода № 1
 for (floor = 1; floor >= -3; floor++){
 System.out.println( "Этаж номер" + floor);
 }
 **/

        if (floor >= minFloor && floor <= maxFloor) {
            currentFloor = currentFloor + floor;
            currentFloor = currentFloor - floor;
            System.out.println("Выбран этаж № - " + floor);
        } else {
            System.out.println("Этаж выбран неверно.");
        }

    // Цикл отображается, но неверно, подскажите пожалуйста на что обратить внимание
       if (floor < currentFloor) {
            while (floor < currentFloor){
                moveUp();
                System.out.println(" Этаж №: " + currentFloor);
                floor = floor + 1;
            }
        } else {
            while (floor > currentFloor){
                moveDown();
                System.out.println(" Этаж №: " + currentFloor);
                floor = floor - 1;
            }
        }
    }
}
