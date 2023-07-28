public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summaCredit = 1_000_000;
        float persent = 9.99F;
        int month12 = 12;
        int month24 = 24;
        int month36 = 36;

        int monthPayment12 = (int) service.calculate(summaCredit, persent, month12);
        System.out.println("Срок кредита: " + month12 + " мес.");
        System.out.println("Сумма ежемесячного платежа: " + monthPayment12 + " руб.");
        System.out.println();

        int monthPayment24 = (int) service.calculate(summaCredit, persent, 24);
        System.out.println("Срок кредита: " + month24 + " мес.");
        System.out.println("Сумма ежемесячного платежа: " + monthPayment24 + " руб.");
        System.out.println();

        int monthPayment36 = (int) service.calculate(summaCredit, persent, month36);
        System.out.println("Срок кредита: " + month36 + " мес.");
        System.out.println("Сумма ежемесячного платежа: " + monthPayment36 + " руб.");
        System.out.println();

    }
}