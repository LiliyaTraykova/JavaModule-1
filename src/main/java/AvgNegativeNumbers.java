package Lecture_9;
//Да се напише програма, която намира AVG на всички отрицателни числа в масива
public class AvgNegativeNumbers {
    public static void main(String[] args) {
        int[] numbers = {-3, -5, -2, 10, 18, -9};
        int sum = 0;
        int count = 0;
     for (int number : numbers) {
         if (number < 0) {
             sum += number;
             count ++;
         }
     }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("AVG стойност на отрицателните числа е: " + average);
        } else {
            System.out.println("Не се съдържат отрицателни числа в масива");
        }
    }
}
