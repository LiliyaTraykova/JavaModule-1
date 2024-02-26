package Lecture_10;

/*public class Main {
    public static void main(String[] args) {
*//*

        Person unknown = new Person();
        unknown.printInfo();
        }
    }
*//*
  // задача калкулатор - функция събиране
      *//*  int sum = Calculator.add(2, 5);
        System.out.println(sum);*//*

        //задача калкулатор - функция деление; същото ще е и за разделяне и умножение
 *//*   int i = Calculator.devide(10, 2);
    System.out.println(i);*//*

    }
}*/

    public class Main {
        public static void main(String[] args) {
            // Създаване на обект от класа Car и инициализиране на параметрите му
            Car car = new Car();
            car.setBrand("BMW");
            car.setModel("X1");
            car.setYear(2020);
            car.setPrice(12000.0);

            // Извеждане на информация за колата
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Price: " + car.getPrice());

            // Изчисляване на годините на колата от настоящото време
            int age = car.calculateAge();
            System.out.println("Age of the car: " + age);

            // Изчисляване на данъка за колата
            double tax = car.calculateTax();
            System.out.println("Tax for the car: " + tax);
        }
    }




