public class Main {

    /*
     * Виды спецификаторов:
     * %d: целочисленных значений
     * %x: для вывода шестнадцатеричных чисел
     * %f: для вывода чисел с плавающей точкой
     * %e: для вывода чисел в экспоненциальной форме,
     * например, 3.1415e+01
     * %c: для вывода одиночного символа
     * %s: для вывода строковых значений
     */

    public static void main(String[] args) {
        Cars car1 = new Cars("Бумер", 2023, 5000000, "черный", 3);
        Cars car2 = new Cars("Мерин", 2022, 6000000, "белый", 2.9);
        Cars car3 = new Cars("Лада Седан", 2000, 1000000, "баклажан", 1.6);

        // System.out.println(car1.getInfo());
        // System.out.println(car1.getStatus());
        // car1.road("Москва");
        // car1.powerButton();
        // System.out.println(car1.getStatus());
        // car1.road("Санкт-Петербург");
        // car1.powerButton();
        // System.out.println(car1.getStatus());

        Games game1 = new Games();
        game1.startGame(car1, car2, car3);

        System.out.println(car1.getMileage());
        System.out.println(car2.getMileage());
        System.out.println(car3.getMileage());
    
        Games game2 = new Games();
        game2.startGame(car1, car2, car3);

        System.out.println(car1.getMileage());
        System.out.println(car2.getMileage());
        System.out.println(car3.getMileage());

    }
}
