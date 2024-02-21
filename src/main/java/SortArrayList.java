package Lecture_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Да се напише програма, която сортира ArrayList от цели числа в нарастващ ред
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(10);
        numbers.add(52);
        numbers.add(11);
        Collections.sort(numbers);
        System.out.println("Числата в нарастващ ред са:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
