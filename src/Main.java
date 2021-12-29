public class Main {
    public static void main(String[] args) {
        int startingAmount = 100;
        int paymentAmount = 1100;
        int bonus = paymentAmount / 100;
        int totalAmount = startingAmount + paymentAmount;
        System.out.println("Сумма счета после пополнения составила " + totalAmount + " рублей");
        if (paymentAmount > 1000) {
            System.out.println("Ваш бонус " + bonus + " рублей");
        } else {
            System.out.println("Ваш бонус 0 рублей");
        }
    }
}
