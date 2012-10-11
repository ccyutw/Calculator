import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/11/12
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class testCalculator {
    @Test
    public void testForAddOneAndTwo()
    {
        Calculator calculator =  new Calculator();
        Assert.assertThat(calculator.add(new int[]{2, 1}), is(3));
    }

    @Test
    public void testForAddTwoAndTwo()
    {
        Calculator calculator =  new Calculator();
        Assert.assertThat(calculator.add(new int[]{3, 1}), is(4));
    }

    @Test
    public void testForAddTwoAndTwoAndTwo()
    {
        Calculator calculator =  new Calculator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        Assert.assertThat(sum, is(6));
    }
    @Test
    public void testForTimesTwoAndThree(){
        Calculator calculator = new Calculator();
        Assert.assertThat(calculator.times(2,3), is(6));
    }

    @Test
    public void testForTimesThreeAndFour(){
        Calculator calculator = new Calculator();
        Assert.assertThat(calculator.times(3,4), is(12));
    }
    @Test
    public void testForTimesRandom(){
        Calculator calculator = new Calculator(new RandomStub());
        Assert.assertThat(calculator.timesRandomNumber(5), is(20));
    }

    public static class RandomStub extends Random {
        @Override
        public int nextInt() {
            return 4;
       }

    }
}
