public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        task1();
        System.out.println(" Задание 2");
        task2();
        System.out.println(" Задание 3");
        task3();
        System.out.println(" Задание 4");
        task4();
        System.out.println(" Задание 5");
        task5();
        System.out.println(" Задание 6");
        task6();
        System.out.println(" Задание 7");
        task7();
        System.out.println(" Задание 8");
        task8();
    }
    public static void task1(){
        int age = 15;
        if (age < 18){
            System.out.println("Вам нет 18-ти, заходите позже:(");
        }
        if (age >= 18){
            System.out.println("Поздравляем с 18-летием!");
        }
    }
    public static void task2(){
        int age = 29;
        if ((age >=7)&&(age <18)){
            System.out.println("Вы ходите в школу");
        }
        if ((age >= 18)&&(age <24)){
            System.out.println("Вы закончили школу, выберите унивеситет и направление");
        }
        if (age >=24){
            System.out.println("Вы закончили университет и моежете искать работу");
        }
    }
    public static void task3(){
        int capacity = 102;
        int sittingPlaces = 60;
        int amountPassengers = 103;
        if (amountPassengers < sittingPlaces){
            System.out.println("Есть сидячее место");
        }
        if ((amountPassengers > sittingPlaces)&&(amountPassengers < capacity)){
            System.out.println("Есть стоячие места");
        }
        if (amountPassengers >= capacity){
            System.out.println("Мест нет");
        }
    }
    public static void task4(){
        int age = 19;
        if (age < 18){
            System.out.println("Вам нет 18-ти, заходите позже:(");
        } else {
            System.out.println("Поздравляем с 18-летием!");
        }
    }
    public static void task5(){
        int age = 29;
        if ((age >=7)&&(age <18)){
            System.out.println("Вы ходите в школу");
        } else if ((age >= 18)&&(age <24)){
            System.out.println("Вы закончили школу, выберите унивеситет и направление");
        } else if (age >=24){
            System.out.println("Вы закончили университет и моежете искать работу");
        }
    }
    public static void task6(){
        int capacity = 102;
        int sittingPlaces = 60;
        int amountPassengers = 102;
        if (amountPassengers < sittingPlaces){
            System.out.println("Есть сидячее место");
        } else if ((amountPassengers > sittingPlaces)&&(amountPassengers < capacity)){
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Мест нет");
        }
    }
    public static void task7(){
        int age = 19;
        if (age > 2 && age < 6){
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в детский сад");
        } else if (age > 6 && age < 19){
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в школу");
        } else if (age >= 19 && age <24) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить на работу");
        }
    }
    public static void task8(){
        int age = 12;
        if (age < 5){
            System.out.println("Ребенок не может кататься на аттракционах");
        } else if (age > 5 && age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься самостоятельно");
        }
    }
}