import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human max = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(max.toString());
        System.out.println(ann.toString());
        System.out.println(kate.toString());
        System.out.println(artem.toString());

        Human vladimir = new Human("Владимир", null, "Казань", "безработный");
        System.out.println(vladimir.toString());
        vladimir.setTown(null);
        System.out.println(vladimir.toString());
        vladimir.setYearOfBirth(null);
        System.out.println(vladimir.toString());

        Flower rose = new Flower("Роза обыкновенная", "", "Голландия", 35.59, null);
        System.out.println(rose.toString());
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        System.out.println(chrysanthemum.toString());
        Flower peony = new Flower("Пион", null, "Англия", 69.9, 1);
        System.out.println(peony.toString());
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(gypsophila.toString());


        Flower[] bouquet = new Flower[9];
        bouquet[0] = rose;
        bouquet[1] = rose;
        bouquet[2] = rose;
        bouquet[3] = chrysanthemum;
        bouquet[4] = chrysanthemum;
        bouquet[5] = chrysanthemum;
        bouquet[6] = chrysanthemum;
        bouquet[7] = chrysanthemum;
        bouquet[8] = gypsophila;

        System.out.printf("Стоимость букета равна: " + "%.2f",  Flower.getBouquet(bouquet));
        System.out.println(" Букет простоит: " + Flower.getLifeSpanBouquet(bouquet));


    }
}