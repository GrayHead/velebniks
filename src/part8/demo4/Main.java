package part8.demo4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11, 22, 33, 44);
        ArrayPrinter arrayPrinter = new AscendingArrayPrinter();


        arrayShow(integers, arrayPrinter);
        arrayShow(integers,new DescendingArrayPrinter());
        arrayShow(integers,new TwoStepArrayPrinter());
        arrayShow(integers,new OddArrayPrinter());



    }


    public static void arrayShow(List<Integer> numbers, ArrayPrinter printer) {
        printer.print(numbers);
    }

}
