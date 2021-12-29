public class Main {
    public static void main(String[] args) {
        int startingAmount = 100;
        int paymentAmount = 1100;
        int bonus = paymentAmount / 100;
        if (paymentAmount > 1000) {
            System.out.println("Ваш бонус составил " + bonus + " рублей");
        } else {
            System.out.println("Ваш бонус составил 0 рублей");
        }
    }
}
