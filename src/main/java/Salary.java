//Задача 2: Метод, който има 1 параметър (заплата) и принтира в конзолата, след извикване, колко е годишната заплата//

public class Salary {
    public static void main(String[] args) {
        long largeNumber = 1500L;
        long yearlySalary = calculateYearlySalary(largeNumber);
        System.out.println("Yearly Salary: " + yearlySalary);
    }

    public static long calculateYearlySalary(long salary) {
        long result = salary * 12;
        return result;
    }
}