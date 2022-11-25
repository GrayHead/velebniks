package part8.demo4;

import java.util.List;

public class OddArrayPrinter extends Xxx implements ArrayPrinter {
    public void print(List<Integer> integers) {
        for (Integer integer : integers) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}
