package by.epam.ayem.module4;/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

class DecimalCounter {

    private int upLimit;
    private int downLimit;
    private int currentValue;

    DecimalCounter(int upLimit, int downLimit, int currentValue) {
        if (upLimit <= 10) {
            System.out.println("Up limit can not be lower than 10. The up limit has been set up as 10");
            this.upLimit = 10;
        } else if (upLimit > 50) {
            System.out.println("Up limit can not be higher than 50. The up limit has been set up as 50");
            this.upLimit = 50;
        } else {
            this.upLimit = upLimit;
        }
        if (downLimit < 0) {
            System.out.println("Down limit can not be lower than 0. The down limit has been set up as 0");
            this.downLimit = 0;
        } else if (downLimit > (this.upLimit - 10)) {
            System.out.println("Down limit can not be higher than the up limit minus 10. " +
                    "The down limit has been set up as " + (this.upLimit - 10));
            this.downLimit = this.upLimit - 10;
        } else {
            this.downLimit = downLimit;
        }
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

    void increaseValue() {
        if (currentValue < upLimit) {
            currentValue++;
            System.out.println("Current value has been increased by 1. Current value = " + currentValue + ".");
        } else {
            currentValue = upLimit;
            System.out.println("Current value = " + currentValue + ". It's the up limit.");
        }
    }

    void decreaseValue() {
        if (currentValue > downLimit) {
            currentValue--;
            System.out.println("Current value has been decreased by 1. Current value = " + currentValue + ".");
        } else {
            currentValue = downLimit;
            System.out.println("Current value = " + currentValue + ". It's the down limit.");
        }
    }

    void getCurrentValue() {
        System.out.println("Current value of the decimal counter = " + currentValue);
//        System.out.println("Down limit of the decimal counter = " + downLimit);
//        System.out.println("Up limit of the decimal counter = " + upLimit);
    }
}
