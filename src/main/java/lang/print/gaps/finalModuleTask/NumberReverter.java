package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int reverted=0,lastNum;
        while (number>0)
        {
            lastNum=number%10;
            number/=10;
            reverted=reverted*10+lastNum;
        }
        System.out.println(reverted);
    }
}
