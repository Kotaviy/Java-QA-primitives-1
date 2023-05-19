public class Main {
    public static void main(String[] args) {
        int ticketPrice = 14500;
        int bonusRUB = 20;
        int miles = ticketPrice / bonusRUB;

        System.out.println("Вам начислено " + miles + " миль.");
    }
}