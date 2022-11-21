package part7.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        List<User> users = Arrays.asList(user1, user2);


        SystemUser systemUser1 = new SystemUser();
        SystemUser systemUser2 = new SystemUser();
        List<SystemUser> systemUsers = Arrays.asList(systemUser1, systemUser2);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        List<Customer> customers = Arrays.asList(customer1, customer2);

        List<User> userList = Arrays.asList(user1, user2, systemUser1, systemUser1, customer1, customer2);

        for (User item : userList) {


            if (item instanceof SystemUser) {

                SystemUser su = (SystemUser) item;
                su.getPassword();

            }

            if (item instanceof Customer) {
                Customer customer = (Customer) item;
                customer.getEmail();
            }
        }


    }
}
