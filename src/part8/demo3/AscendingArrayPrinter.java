package part8.demo3;

import java.util.List;

public class AscendingArrayPrinter extends ArrayPrinter{
    @Override
    public void print(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
