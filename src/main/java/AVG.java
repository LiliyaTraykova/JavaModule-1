// Задача 1: Метод, който приема 3 числа и пресмята средно аритметично число от дадените 3 параметъра.
// Принтирайте резултата в конзолата//

public class AVG {
    public static void main(String[] args) {
        int numberOne = 2;
        int numberTwo = 4;
        int numberThree = 5;

        calculateAVG(numberOne, numberTwo, numberThree);
    }

    public static void calculateAVG(int numberOne, int numberTwo, int numberThree) {
        int result = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("AVG: " + result);
    }
}
