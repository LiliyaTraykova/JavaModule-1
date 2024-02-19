package Lecture_7;

public class CreditCalculator {
    public static void main(String[] args) {
        calculateCreditDetails("LiliyaTraykova", 19, 50200, 10, 3500);
        calculateCreditDetails("MariyaIlieva", 17, 2000, 10, 1900);
    }

    private static void calculateCreditDetails(String fullName, int age, int amount, int months, int salary) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18г.");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Не може да изтеглите сума под 1000лв за период по-дълъг от 12м");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Месечната вноска е равна на " + monthlyPayment);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;

                if (amount > 50000) {
                    if (salary > 2000) {
                        System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва %.2f%% е %.2f лева.%n", amount, months, interestRate * 100, monthlyPayment);
                    } else {
                        System.out.println("Съжаляваме, но максимума за такъв доход е 20 000 лева");
                    }
                } else if (salary > 5000) {
                    System.out.println("С такъв доход можем да ви предложим 100 000 лева");
                } else {
                    System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва %.2f%% е %.2f лева.%n", amount, months, interestRate * 100, monthlyPayment);
                }
            }
        }
    }

    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% лихва за суми до 5000лв
        } else if (amount <= 10000) {
            return 0.04; // 4% лихва за суми над 10000лв
        } else {
            return 0.03; // 3% лихва за други суми
        }
    }
}
