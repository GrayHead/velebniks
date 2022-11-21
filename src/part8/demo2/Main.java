package part8.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sing> sings = new ArrayList<>();
        sings.add(new User());
        sings.add(new Student());

        Sing sing = sings.get(0);
        sing.singSong();


        Run run = new User();
        run.runMarathon(100);

        ArrayList<String> baseList = new ArrayList<>();

        Iterable<String> strings = baseList;

        Collection<String> strings1 = baseList;


        asdqwe();
    }

    public static void asdqwe(List<String> strings) {

    }
}
