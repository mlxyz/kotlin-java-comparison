package de.hspf.java.examples.concise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String args[]) {

        User user1 = new User("Max Mustermann", "max@example.com", "Musterfirma GmbH");
        User user2 = new User("Max Mustermann", "max@example.com", "Musterfirma GmbH");

        System.out.println("User 1 is " + user1.toString());
        System.out.println("User 2 is " + user2.toString());

        System.out.println("User 1 and 2 are " + (user1.equals(user2) ? "equal" : "not equal") + ".");

        user2.setName("Maxime Musterfrau");
        System.out.println("User 2 name is now " + user2.getName());
        System.out.println("User 1 and 2 are " + (user1.equals(user2) ? "equal" : "not equal") + ".");

        User user3 = new User("Angelo Merte", "merte@angelo.com", "BRD GmbH");
        User user4 = new User("Zacharia Zweibein", "zach@gmail.com", "Zauber GmbH");

        List<User> userList = Arrays.asList(user1, user2, user3, user4);
        System.out.println("Users starting with \"M\":");
        System.out.println(userList.stream().filter(it -> it.getName().startsWith("M")).collect(Collectors.toList()));
    }


}
