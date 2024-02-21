package Lecture_9;
//Да се напише програма, която премахва всички повторения от свързан списък

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("John");
        names.add("Bob");
        names.add("Alice");
        names.add("Alice");
        names.add("Jenn");
        names.add("Lina");

        removeDuplicates(names);

        System.out.println("Списъкът с имена без повторения е следният:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void removeDuplicates(HashSet<String> names) {
        HashSet<String> uniqueNames = new HashSet<>(names);
        names.clear();
        names.addAll(uniqueNames);
    }
}

