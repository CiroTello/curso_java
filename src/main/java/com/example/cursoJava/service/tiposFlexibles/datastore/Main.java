package com.example.cursoJava.service.tiposFlexibles.datastore;

public class Main {

    public static void main(String[] args) {
        Datastore<User, String> userStore = new Datastore<>();

        Main main = new Main();
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        userStore.add("user1", user1);
        userStore.add("user2", user2);

        System.out.println("Get user1: " + userStore.find("user1").getName());

        userStore.getAll().forEach(user -> System.out.println("\nUser: " + user.getName()));
    }
}
