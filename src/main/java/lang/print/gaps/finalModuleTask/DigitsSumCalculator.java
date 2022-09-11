package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int reverted=0,lastNum;
        while (number>0)
        {
            lastNum=number%10;
            number/=10;
            reverted=reverted+lastNum;
        }
        System.out.println(reverted);
    }
}
