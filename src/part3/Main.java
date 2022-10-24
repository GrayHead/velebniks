package part3;

import part2.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        byte b = 127;
//        short i;
//        int i;
//        long lg = 1233235434L;

//        > < >= <= == !=
//        boolean b = true;

//        char c = '_';
//        char c = 65; //a
//        System.out.println(c);

//        String s = "ahs";


//                                      0 1 2
//        int[] numbers = new int[3]; // [0,0,0]
//        numbers[0] = 11;
//        numbers[1] = 22;
//        numbers[2] = 33;
//        System.out.println(Arrays.toString(numbers));

//        int[] nums = {11, 22, 33, 44, 55};
//        nums[0] = 111;

//        User[] users = {
//                new User(1, "vasya 1"),
//                new User(2, "vasya 2"),
//                new User(3, "vasya 3")
//        };
//
//        System.out.println(Arrays.toString(users));


//        int[] nums = {11, 22, 33, 44, 55};
//
//        for (int i : nums) {
//            System.out.println(i);
//        }


        User[] users = {
                new User(1, "vasya 1"),
                new User(2, "petya 2"),
                new User(3, "vasya 3"),
                new User(4, "petya 4"),
        };

        // iter

//        System.out.println(users); //aus^S46$^%$^%$7

//        for (User user : users) {
//            System.out.println(user.getName());
//        }


        // itar
        for (int i = 1; i < users.length - 1; i++) {
            User user = users[i];
            System.out.println(user);
        }
        System.out.println();
//        ritar

        for (int i = users.length - 1; i >= 0; i--) {
            User user = users[i];
            System.out.println(user);
        }

        System.out.println();

        /// exclel -4 -> exl

        for (User user : users) {

            if (user.getName().contains("vasya")) {
                System.out.println(user);
            }

        }
    }

    // iter
    // itar
    //ritar
    // itar 2    -3

}

