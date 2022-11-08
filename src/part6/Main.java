package part6;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("ajshdghgsa1");
//        list.add("asd");
//        list.add("ajshdghgsa3");
//        list.add("ajshdghgsa4");
//        System.out.println(list);
//        list.contains("asd"); // true

        ArrayList<Skill> skills1 = new ArrayList<>();
        skills1.add(new Skill(1, "java", 3));
        skills1.add(new Skill(2, "js", 2));

        Mentor mentor = new Mentor(1, "asd", skills1);
        //
        //
        //
        //
        //
        //
        mentor.getSkills().add(new Skill());

    }
}

