package part8.demo3;

import java.util.List;

public class TwoStepArrayPrinter extends ArrayPrinter {
    @Override
    public void print(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i = i + 2) {
            System.out.println(numbers.get(i));


        }
    }
}
