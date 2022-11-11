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

        Human vladimir = new Human("Владимир", 2001, "Казань", "безработный");
        System.out.println(vladimir.toString());

    }
}