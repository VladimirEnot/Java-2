public class Main {
    public static void main(String[] args) {
        int x = 2000; // Стоимость  1 билета
        int y = 20; // Стоимость 1 мили
        boolean isPurchase = true;

        int mile;
        if (isPurchase) {
            mile = 1;
        } else {
            mile = 0;
        }

        int bonus = x / y ;

        System.out.println("Итоговое количество миль : "+ bonus);
    }
}

