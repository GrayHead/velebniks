package part4_while.demo2;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"java", "js", "db"};
        User user1 = new User(1, "vasya", strings);

        User user2 = new User(2, "kokos", "js", "html", "css");
        User user3 = new User(3, "abrikos", "html", "html", "react");
        User user4 = new User(4, "tomat", "mysql", "mongo", "dart");
        User user5 = new User(5, "banan", "mongo", "angular", "css");

        User[] users = {user1, user2, user3, user4, user5};

        for (User user : users) {
            System.out.println(user);
            // ctrl alt v

            String[] skills = user.getSkills();
            for (String skill : skills) {
                System.out.println(skill);
            }


        }


        User petya = new User(10, "petya");
        petya.fillArrayItem(0,"java");
        petya.fillArrayItem(1,"js");
        petya.fillArrayItem(2,"node");

        User socketUPdate = new User(11, "asdad", 5);
        socketUPdate.fillArrayItem(0,"asdsad");
        socketUPdate.fillArrayItem(1,"asdsad");
        socketUPdate.fillArrayItem(2,"asdsad");
        socketUPdate.fillArrayItem(3,"asdsad");
        socketUPdate.fillArrayItem(4,"asdsad");


    }
}
