public class CreditPaymentService {
    public float calculate(int summaCredita, float persent, int month) {

        float persentMonth = persent / 100 / 12;
        float monthPayment = (float) (summaCredita * persentMonth * Math.pow((1 + persentMonth), month) / (Math.pow((1 + persentMonth), month) - 1));

        //double znamenatel = Math.pow((1 + persentMonth), month) - 1;
        //double monthPayment = chislitel / znamenatel;

        return monthPayment;
    }
}
