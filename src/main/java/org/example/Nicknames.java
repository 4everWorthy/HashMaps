package org.example;


import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nameToNicknames = new HashMap<>();

        nameToNicknames.put("matthew", "matt");
        nameToNicknames.put("michael", "mike");
        nameToNicknames.put("arthur", "artie");

        String matthew = nameToNicknames.get("matthew");
        String michael = nameToNicknames.get("michael");
        String arthur = nameToNicknames.get("arthur");

        System.out.println(matthew);

    }

}
