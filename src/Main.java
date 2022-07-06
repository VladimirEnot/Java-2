public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000; // Стоимость  1 билета
        int bonusPrice = 20; // Стоимость 1 мили
        boolean isPurchase = true;

        int mile;
        if (isPurchase) {
            mile = 1;
        } else {
            mile = 0;
        }

        int bonus = ticketPrice / bonusPrice ;

        System.out.println("Итоговое количество миль : "+ bonus);
    }
}

