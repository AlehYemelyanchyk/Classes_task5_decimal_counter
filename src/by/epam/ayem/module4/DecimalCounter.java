package by.epam.ayem.module4;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class DecimalCounter {

    private int upLimit = 50;
    private int downLimit = 10;
    private int currentValue = 10;

    public DecimalCounter(int upLimit, int downLimit, int currentValue) {
        this.upLimit = upLimit;
        this.downLimit = downLimit;

        if (currentValue < this.downLimit) {
            System.out.println("Current value can not be lower than the down limit. " +
                    "The current value has been set up as " + this.downLimit);
            this.currentValue = this.downLimit;
        } else if (currentValue > this.upLimit) {
            System.out.println("Current value can not be higher than the up limit. " +
                    "The current value has been set up as " + this.upLimit);
            this.currentValue = this.upLimit;
        } else {
            this.currentValue = currentValue;
        }
    }

    public DecimalCounter() {
    }

    public void increaseValue() {
        if (currentValue < upLimit) {
            currentValue++;
            System.out.println("Current value has been increased by 1. Current value = " + currentValue + ".");
        } else {
            System.out.println("Current value = " + currentValue + ". It's the up limit.");
        }
    }

    public void decreaseValue() {
        if (currentValue > downLimit) {
            currentValue--;
            System.out.println("Current value has been decreased by 1. Current value = " + currentValue + ".");
        } else {
            System.out.println("Current value = " + currentValue + ". It's the down limit.");
        }
    }

    public void getCurrentValue() {
        System.out.println("Current value of the decimal counter = " + currentValue);
    }
}
