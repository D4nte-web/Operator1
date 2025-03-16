
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека меньше " + age + ", то он не достиг совершеннолетия.");
        }
        System.out.println("Задача 2");
        int degree = 3;
        if (degree < 5) {
            System.out.println("На улице " + degree + " градуса, нужно надеть шапку.");
        }
        System.out.println("Задача 3");
        int speed = 50;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println("Задача 4");
        int year1 = 16;
        if (year1 > 2 && year1 < 6) {
            System.out.println("Если возраст человека равен" + year1 + ", то ему нужно ходить в детский сад");
        }
        if (year1 > 7 && year1 < 17) {
            System.out.println("Если возраст человека равен " + year1 + ", то ему нужно ходить в школу.");
        }
        if (year1 >= 18 && year1 <= 24) {
            System.out.println("Если возраст челвоека равен " + year1 + " , то ему нужно ходить в университет");
        } else {
            if (year1 > 24) {
                System.out.println("Если возраст человека равен" + year1 + ", то ему нужно ходить на работу");
            }
        }
        System.out.println("Задача 5");
        int kid = 4;
        if (kid < 5) {
            System.out.println("Если возраст ребёнка равен " + kid + ", то ему нельзя кататься на аттракционе.");
        }
        if (kid > 5 && kid < 14) {
            System.out.println("Если возраст ребёнка равен" + kid + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (kid > 14) {
            System.out.println("Если возраст ребёнка равен" + kid + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
        System.out.println("Задача 6");
        int places = 54;
        if (places < 60) {
            System.out.println("В вагоне есть сидячее место.");
        }
        if (places > 60 && places < 102){
            System.out.println("В вагоен нет сидячих мест.");
        } else {
            if (places >= 102){
                System.out.println("Вагон полностью забит");
            }
        }
        System.out.println("Задача 7");
        int one = 5;
        int two = 10;
        int three = 15;
        if (one < three && three > two) {
            System.out.println("Число " + three + " больше остальных");
        } else if (three < two && two > one) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + one + " больше остальных");
        }
    }
}
