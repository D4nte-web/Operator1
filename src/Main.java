
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
        if (year1 > 7 && year1 < 17) {
            System.out.println("Если возраст человека равен 16, то ему нужно ходить в школу.");
        }
        System.out.println("Задача 5");
        int kid = 4;
        if (kid < 5) {
            System.out.println("Если возраст ребёнка равен 4, то ему нельзя кататься на аттракционе.");
        }
        System.out.println("Задача 6");
        int places = 54;
        if (places < 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else {
            System.out.println("В вагоен нет сидячих мест.");
        }
        System.out.println("Задача 7");
        int one = 5;
        int two = 10;
        int three = 15;
        if (one < two && three > two) {
            System.out.println("Число 15 больше остальных");
        } else if (three < one && one > two) {
            System.out.println("Число 10 больше остальных");
        } else {
            System.out.println("Число 5 больше остальных");
        }
    }
}
