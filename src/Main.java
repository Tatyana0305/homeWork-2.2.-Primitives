public class Main {
    public static void main(String[] args) {
        int startingAmount = 100;
        int paymentAmount = 1200;
        int bonus = paymentAmount / 100;
        int totalAmount1 = startingAmount + paymentAmount + bonus;//итоговая сумма при пополнении свыше 1000 руб
        int totalAmount2 = startingAmount + paymentAmount;//итоговая сумма при пополнении менее 1000 руб
        if (paymentAmount > 1000) {
            System.out.println("Сумма счета после пополнения составила " + totalAmount1 + " рублей, включая бонус");
            System.out.println("Ваш бонус " + bonus + " рублей");
        } else {
            System.out.println("Сумма счета после пополнения составила " + totalAmount2 + " рублей");
            System.out.println("Ваш бонус 0 рублей");

        }
    }
}
