package part1;

public class Start {
    public static void main(String[] args) {
        System.out.println("hello");

//        part1.User user1 = new part1.User();
//        user1.id = 1;
//        user1.name = "vasya";
//        user1.surname = "pupkin";
//        user1.age = 31;

        User user1 = new User(2, "petya", "gubkin", 22);
        User user2 = new User(3,  43);


    }
}

class User {
    int id;
    String name;
    String surname;
    int age;

//    construcotr
    public User() {
    }

//    construcotr
    public User(int id,String name, String surname,int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }
}
