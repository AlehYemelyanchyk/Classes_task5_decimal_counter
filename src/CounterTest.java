public class CounterTest {

    public static void main(String[] args) {

        DecimalCounter dc = new DecimalCounter(5,0,3);
        dc.getCurrentValue();
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
