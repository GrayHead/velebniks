package part2;

public class Main {
    public static void main(String[] args) {

        User user = new User(1,"vasya");
//        user.id = -2;
        System.out.println(user); // 1

        user.setId(2);
        System.out.println(user); //-2

        //aisdghagdsjhgasdgasd
        //aisdghagdsjhgasdgasd
        //aisdghagdsjhgasdgasd
        //aisdghagdsjhgasdgasd
        //aisdghagdsjhgasdgasd
//        System.out.println(user.id);
        System.out.println(user.getId());
//        user.name = "hfdsahagfsdhg";
        user.setName("jaSFDHAGFSD");


    }
}
