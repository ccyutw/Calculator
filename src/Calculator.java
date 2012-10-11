import java.util.Random;

public class Calculator {
    private Random random;

    public Calculator() {

    }

    public Calculator(Random numGenerator) {
        random = numGenerator;

    }


    public int times(int num1, int num2) {
        return num1  * num2 ;
    }

    public int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public Integer timesRandomNumber(int number) {
        return number * random.nextInt();

    }
}
