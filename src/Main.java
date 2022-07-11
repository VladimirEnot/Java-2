public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000; // Стоимость  1 билета
        int bonusPrice = 20; // Стоимость 1 мили
        int bonus = ticketPrice / bonusPrice ;

        System.out.println("Итоговое количество миль : "+ bonus);
    }
}

