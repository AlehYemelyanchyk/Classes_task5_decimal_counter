package by.epam.ayem.module4;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий
получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class AppRunner {
    public static void main(String[] args) {
        DecimalCounter dc = new DecimalCounter(5,0,3);
        dc.getCurrentValue();
        dc.increaseValue();
        dc.increaseValue();
        dc.increaseValue();
        dc.decreaseValue();
        dc.decreaseValue();
        dc.decreaseValue();
        dc.decreaseValue();
        dc.decreaseValue();
        dc.decreaseValue();
        dc.getCurrentValue();
    }
}
