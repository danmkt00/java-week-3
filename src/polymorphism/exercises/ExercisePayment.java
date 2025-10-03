package polymorphism.exercises;

import java.util.*;

/**
 TODO:
 1. Create a superclass Payment with method pay(double amount).
 2. Create subclasses:
      - CreditCardPayment (prints "Paid <amount> using Credit Card").
      - PayPalPayment (prints "Paid <amount> using PayPal").
      - CashPayment (prints "Paid <amount> in cash").
 3. In main():
      - Create a List<Payment>.
      - Add different payment types.
      - Loop and call pay() → each behaves differently.
*/

interface Payment
{
    void pay(double amount);
}

class CreditCardPayment implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid "+ amount + " using Credit Card");
    }
}

class PayPalPayment implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid "+ amount + " using PayPal");
    }
}

class CashPayment implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid "+ amount + " in cash");
    }
}

public class ExercisePayment
{
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<Payment>();
        payments.add(new CreditCardPayment());
        payments.add(new PayPalPayment());
        payments.add(new CashPayment());

        for(Payment p : payments)
        {
            p.pay(3000);
        }

    }
}
