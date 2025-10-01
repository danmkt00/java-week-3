package interfaces.exercises;
/**
 * TODO:
 * Exercise 2:
 * Define an interface Payment with a method pay(double amount).
 * Implement classes: PaypalPayment, BankTransferPayment.
 * Each class should print a custom payment message.
 * Write a Demo that processes both payments.
 */
public class Exercise2
{
    public static void main(String[] args) {
        PaypalPayment paypalPayment = new PaypalPayment();
        paypalPayment.pay(30.12);

        BankTransferPayment bankTransferPayment = new BankTransferPayment();
        bankTransferPayment.pay(252);

    }
    interface Payment
    {
        void pay(double amount);
    }
    static class PaypalPayment implements Payment
    {
        @Override
        public void pay(double amount)
        {
            System.out.println("Paid " + amount + " using PayPal.");
        }

    }
    static class BankTransferPayment implements Payment
    {
        @Override
        public void pay(double amount)
        {
            System.out.println("Paid " + amount + " via Bank Transfer.");
        }
    }
}
