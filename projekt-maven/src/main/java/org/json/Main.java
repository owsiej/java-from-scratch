package org.json;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User("Michał", 31);
        User user1 = new User("Marzena", 32);
        User user2 = new User("Jacus", 40);
        List<User> users2 = new ArrayList<>();
        users2.add(user);
        users2.add(user1);
        users2.add(user2);

//        ObjectMapper objectMapper = new ObjectMapper();

//        File usersFile = new File("src/main/resources/users.json");
//        List<User> users = objectMapper.readValue(usersFile, new TypeReference<>() {
//        });
////        users.forEach(user -> {
//            System.out.println(user.getName());
//            System.out.println(user.getAge());
//        });
//
//        objectMapper.writeValue(new File("src/main/resources/users2.json"), users2);

        Gson gson = new Gson();
//        JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/users.json"));
//        User[] users = gson.fromJson(jsonReader, User[].class);
//        Arrays.asList(users).forEach(user5 -> {
//            System.out.println(user5.getName());
//            System.out.println(user5.getAge());
//        });
        FileWriter fileWriter = new FileWriter("src/main/resources/users3.json");
        gson.toJson(users2, fileWriter);
        fileWriter.flush();
        fileWriter.close();

    }
}